package com.cts.project.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.project.bean.User;
import com.cts.project.dao.UserDAO;

public class UserUnitTest {

	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	private static User user;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.project");
		context.refresh();
		user = (User) context.getBean("user");
		userDAO = (UserDAO) context.getBean("userDAO");
	}

	@Test
	public void test() {
		List<User> users = userDAO.getAllUsers();
		assertEquals(2, users.size());
	}

//	@Test
//	public void test_update_user_success() {
//		User u = userDAO.getUserById(101);
//		u.setUsername("gds");
//
//		assertEquals(true, userDAO.updateUser(u));
//	}
//
//	@Test
//	public void test_add_new_user() {
//		User u = new User(104, "gds@gds", "asd", "gurudutt", "user", 123123);
//		assertEquals(true, userDAO.saveUser(u));
//	}

	@Test
	public void test_delete_user() {
		User u = userDAO.getUserById(102);
		assertEquals(true, userDAO.deleteUser(u));
	}

}
