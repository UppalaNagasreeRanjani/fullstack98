package com.cts.training.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.User;

public class UserController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		User user = new User(103, "test", "test@123", "admin@cts.com", 9789798789L, true);
//		
//		session.save(user);
		
		//to fetch the records of user we will use get method
		User getUser=session.get(User.class,102 );
		//getUser.setEnabled(true);
		//getUser.setPassword("15454");
		
		//session.update(getUser);
		//delte user record one row
		//session.delete(getUser);
		List<User>users=session.createQuery("From User").getResultList();
		users.forEach(System.out::println);
		transaction.commit();
		session.close();

		
		boolean status=userDAO.isValidUser("saikrishna","123456");
		if(status) {
			System.out.println("valid user");
		}
		else {
			System.out.println("invalid user");
		}
	}

}
