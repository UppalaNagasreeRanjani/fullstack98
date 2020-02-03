package com.cts.training.controller;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;


public class EmployeeController {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		Employee employee =new Employee();
		employee.setName("sai");
		PermanentEmployee pe=new PermanentEmployee();
		pe.setSalary(47647576D);;
		pe.setBonus(5765F);
		ContractualEmployee ce=new ContractualEmployee();
		ce.setPayPerHour(64576486);
		ce.setContractPeriod(23);
//		List<String> emails =new ArrayList<String>();
//		emails.add("sai@gmail.com");
//		emails.add("krishna@gmail.com");
//		employee.setEmails(emails);
	session.save(employee);
	session.save(pe);
	session.save(ce);
		tx.commit();
		session.close();
	}
}




