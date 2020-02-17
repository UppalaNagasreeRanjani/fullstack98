package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.CompanyDAO;

import com.cts.training.model.Company;


public class CompanyUnitTest {
	
	
	private static AnnotationConfigApplicationContext context;
	private static CompanyDAO companyDAO;
	private static Company company;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		company=(Company) context.getBean("company");
		
		companyDAO=(CompanyDAO) context.getBean("companyDAO");
	}
	
//	@Test
//	public void testGetAllUsers() {
//		List<Company> users=companyDAO.getAllCompany();
//		assertEquals(2,users.size());
//	}
	
//	@Test(expected = NullPointerException.class)
//	public void test_update_user() {
//		Company r=companyDAO.getUserById(1);
//		r.setCompanyname("CTS");
//		assertEquals(true,companyDAO.updateCompany(r));
//	}
	
//	@Test
//	public void test_add_user() {
//		Company re=new Company(1,"Cognizant","IT","Brian Humphries","Kieran",988.87);
//		assertEquals(true,companyDAO.saveCompany(re));
//	}
	
//	@Test(expected=IllegalArgumentException.class)
//	public void test_delete_user() {
//		Company r=companyDAO.getUserById(1);
//		assertEquals(true,companyDAO.deleteCompany(r));
//	}
	
//	@Test
//	public void test_get_id() {
//		Company r=companyDAO.getUserById(55);
//		assertNotEquals("Microsoft",r.getCompanyname());
//	}
	



}
