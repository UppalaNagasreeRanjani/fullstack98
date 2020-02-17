package com.cts.training.test;

import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.StockPriceDAO;
import com.cts.training.model.StockPrice;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class StockPriceUnitTest {

	private static AnnotationConfigApplicationContext context;
	private static StockPriceDAO stockPriceDAO;
	private static StockPrice stockPrice;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		stockPrice=(StockPrice) context.getBean("stockPrice");
	
		stockPriceDAO=(StockPriceDAO) context.getBean("stockPriceDAO");
	}
	
	@Test
	@Ignore
	public void testGetAllUsers() {
		List<StockPrice> users=stockPriceDAO.getAllStockPrices();
		assertEquals(2,users.size());
	}
	
//	@Test(expected = NullPointerException.class)
//	@Ignore
//	public void test_update_user() {
//		StockPrice r=stockPriceDAO.getStockPriceById(1);
//		r.setCurrentPrice(787);
//		assertEquals(true,stockPriceDAO.updateStockPrice(r));
//	}
	
	@Test

	public void test_add_user() {
		StockPrice re=new StockPrice(1,123,873.57,LocalDateTime.now());
		assertEquals(true,stockPriceDAO.addOrUpdateStockPrice(re));
	}
	
	@Ignore
	@Test(expected=IllegalArgumentException.class)
	public void test_delete_user() {
		StockPrice r=stockPriceDAO.getStockPriceById(1);
		assertEquals(true,stockPriceDAO.deleteStockPrice(r));
	}
	
	@Test
	@Ignore
	public void test_get_id() {
		StockPrice r=stockPriceDAO.getStockPriceById(55);
		assertNotEquals(876,r.getCurrentPrice());
	}


}
