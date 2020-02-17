package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.RegisterDAO;
import com.cts.training.dao.impl.RegisterDAOImpl;
import com.cts.training.model.Register;

public class RegisterUnitTest {

	private static AnnotationConfigApplicationContext context;
	private static RegisterDAO registerDAO;
	private static Register register;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		register=(Register) context.getBean("register");
		registerDAO=(RegisterDAO) context.getBean("registerDAO");
	}
	
	@Test
	public void testGetAllUsers() {
		List<Register> users=registerDAO.getAllUsers();
		assertEquals(3,users.size());
	}
	
//	@Test(expected = NullPointerException.class)
//	public void test_update_user() {
//		Register r=registerDAO.getUserById(53);
//		r.setUsername("RAM");
//		assertEquals(true,registerDAO.updateUser(r));
//	}
	
//	@Test
//	public void test_add_user() {
//		Register re=new Register(55,"ROBERT","Robert","Pattinson","robert@gmail.com",988768960L,"Robert@123");
//		assertEquals(true,registerDAO.saveUser(re));
//	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_delete_user() {
		Register r=registerDAO.getUserById(53);
		assertEquals(true,registerDAO.deleteUser(r));
	}
	
	@Test
	public void test_get_id() {
		Register r=registerDAO.getUserById(55);
		assertNotEquals("Roshan",r.getUsername());
	}
	

}
