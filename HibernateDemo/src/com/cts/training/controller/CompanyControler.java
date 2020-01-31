package com.cts.training.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Company;
//import com.cts.training.model.User;
import com.cts.training.model.StockExchange;

public class CompanyControler {
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	 //Company company=new Company(102,"cts","digital","brian",715368153);
	//session.save(company);
	StockExchange s=new StockExchange(106, "nagasriranjani", "guntur", "ntgfhgf");
	session.save(s);
	 //Company getCompany=session.get(Company.class,102);
	 //getCompany.setCeoName("nagasri");
	 //session.update(getCompany);
	// session.delete(getCompany);
//	 List<Company>company=session.createQuery("From Company").getResultList();
//		company.forEach(System.out::println);
	 
	transaction.commit();
	 session.close();
	 
}
}