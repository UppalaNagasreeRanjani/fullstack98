package com.cts.training.test;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.training.model.User;

import jdk.nashorn.internal.ir.annotations.Ignore;

import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;
public class UserUnitTest {
	private static  AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	private static User user;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user =(User) context.getBean("user");
		userDAO =(UserDAO)context.getBean("userDAO");
	}
	@Test
	@Ignore
	public void testGetAllUsers() {
		List<User> users=userDAO.getAllUsers();
		assertEquals(2,users.size());
	
	}
	@Test
	@Ignore
	public void test_update_user_success()
	{
		User u=userDAO.getUserById(2);
		u.setEnabled(true);
		assertEquals(true,userDAO.saveOrUpdateUser(u));
	}
	@Test
	@Ignore
	public void test_user_login()
	{
		assertEquals(true,userDAO.isValidUser("anu","1254hk"));
	}
	
	@Test(expected=NullPointerException.class)
	@Ignore
		public void test_get_user_by_id_fail()
		{
			User u=userDAO.getUserById(3);
			assertEquals("sai",u.getUsername());
		}	

	@Test
    @Ignore
	public void test_delete_user()
	{
		User u=userDAO.getUserById(4);
		assertEquals(true,userDAO.deleteUser(u));
		
	}
	
	
}	
