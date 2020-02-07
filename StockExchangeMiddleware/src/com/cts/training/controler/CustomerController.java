package com.cts.training.controler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cts.training.model.AccountEntity;
import com.cts.training.model.CustomerEntity;
import com.cts.training.model.FundEntity;
public class CustomerController {
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("new.xml");
		  CustomerEntity entity =(CustomerEntity)context.getBean("ICHD");
	      System.out.println(entity);
	      AccountEntity account = entity.getAccdetails();
	      System.out.println(account.getAccNumber() + account.getAcctype());
	      FundEntity funds = account.getFund();
	      System.out.println(funds.getAmount());
		}
}