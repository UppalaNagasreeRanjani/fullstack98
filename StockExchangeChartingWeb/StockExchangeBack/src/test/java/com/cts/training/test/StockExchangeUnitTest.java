package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.SectorDAO;
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.Sector;
import com.cts.training.model.StockExchange;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class StockExchangeUnitTest {

	private static AnnotationConfigApplicationContext context;
	private static StockExchangeDAO stockExchangeDAO;
	private static StockExchange stockExchange;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		stockExchange=(StockExchange) context.getBean("stockExchange");
	
		stockExchangeDAO=(StockExchangeDAO) context.getBean("stockExchangeDAO");
	}
	
	@Test
	@Ignore
	public void testGetAllUsers() {
		List<StockExchange> users=stockExchangeDAO.getAllStockExchanges();
		assertEquals(2,users.size());
	}
	
//	@Test(expected = NullPointerException.class)
//	@Ignore
//	public void test_update_user() {
//		StockExchange r=stockExchangeDAO.getStockExchangeById(1);
//		r.setExchangeName("CTS");
//		assertEquals(true,stockExchangeDAO.updateStockExchange(r));
//	}
	
	@Test

	public void test_add_user() {
		StockExchange re=new StockExchange(1,"stockexchange","contact address","brief","remarks");
		assertEquals(true,stockExchangeDAO.addOrUpdateStockExchange(re));
	}
	
	@Ignore
	@Test(expected=IllegalArgumentException.class)
	public void test_delete_user() {
		StockExchange r=stockExchangeDAO.getStockExchangeById(1);
		assertEquals(true,stockExchangeDAO.deleteStockExchange(r));
	}
	
	@Test
	@Ignore
	public void test_get_id() {
		StockExchange r=stockExchangeDAO.getStockExchangeById(55);
		assertNotEquals("CSE",r.getExchangeName());
	}


}
