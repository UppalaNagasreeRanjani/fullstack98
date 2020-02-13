package com.cts.training.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.Company;
import com.cts.training.bean.StockExchange;
import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.StockExchangeDAO;

public class StockExchangeUnitTest {
	
	private static  AnnotationConfigApplicationContext context;
	private static StockExchangeDAO stockExchangeDAO;
	private static StockExchange stockExchange;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		stockExchange =(StockExchange) context.getBean("stockExchange");
		stockExchangeDAO =(StockExchangeDAO) context.getBean("stockExchangeDAO");
	} 

	
	
	@Test
	public void test_save_stockExchange_success() {
		StockExchange s=new StockExchange(23,"naga","BSE","Chennai","remarks");
		assertEquals(true,stockExchangeDAO.saveStockExchange(s));
	}

}
