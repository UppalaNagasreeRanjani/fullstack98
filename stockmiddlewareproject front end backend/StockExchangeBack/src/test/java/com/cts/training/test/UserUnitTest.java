package com.cts.training.test;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;
import com.cts.training.daoimpl.UserDAOImpl;
public class UserUnitTest {
	private static  AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private static User user;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user =(User) context.getBean("user");
		userDAO =(UserDAO) context.getBean("userDAO");
	}
//	@Ignore
//	@Test
//	public void testGetAllUsers() {
//		List<User> users=userDAO.getAllUsers();
//		assertEquals(3,users.size());
//		//fail("Not yet implemented");
//	}
//	@Ignore
//	@Test
//	public void test_update_user_success() {
//		
//		User u=userDAO.getUserById(105);
//		u.setEnabled(false);
//		assertEquals(true, userDAO.saveOrUpdateUser(u));
//	}
//	@Ignore
//	@Test
//	public void test_user_login() {
//		
//		assertEquals(true,userDAO.isValidUser("sri", "1235678"));
//		
//	}
//	@Ignore
//	@Test(expected=NullPointerException.class)
//	public void test_get_user_by_id_fail() {
//		
//		User u=userDAO.getUserById(109);
//		assertEquals("Krishna",u.getUsername());
//		
//	}
//	@Ignore
//	@Test
//	
//	public void test_delete_user() {
//		
//		User u=userDAO.getUserById(105);
//		assertEquals(true,userDAO.deleteUser(u));
//		
//		
//	}
	@Test
	public void test_save_user_success() {
		User u=new User(26,"sri","naga","naga@gmail.com",5656543355L,true);
		assertEquals(true,userDAO.saveUser(u));
	}
	
	
	
}