package com.cts.training.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.Company;
import com.cts.training.dao.CompanyDAO;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		
		Company company = (Company)context.getBean("company");
		CompanyDAO dao = (CompanyDAO)context.getBean("companyDAO");
		
		company.setCeo("hjkhk");
		company.setName("abc");
	    dao.saveCompany(company);
		System.out.println("Bean Created");
	}

}
