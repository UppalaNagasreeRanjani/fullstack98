package com.cts.training.controller;


	
	import java.util.ArrayList;
	import java.util.List;
	import javax.transaction.Transaction;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;
	import com.cts.training.model.Employee;
	public class EmployeeControler {
		public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction tx =session.beginTransaction();
			Employee employee =new Employee();
			employee.setName("sai");
			List<String> emails =new ArrayList<String>();
			emails.add("sai@gmail.com");
			emails.add("krishna@gmail.com");
			employee.setEmails(emails);
			session.save(employee);
			tx.commit();
			session.close();
		}
	}

