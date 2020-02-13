package com.cts.training.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.Company;
import com.cts.training.bean.IPO;
import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.IPODAO;

public class IPOUnitTest {
	private static AnnotationConfigApplicationContext context;
	private static IPODAO ipoDAO;
	private static IPO ipo;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		ipo = (IPO) context.getBean("ipo");
		ipoDAO = (IPODAO) context.getBean("ipoDAO");
	}

//	@Test
//	public void testGetAllIPOs() {
//		List<IPO> ipos=ipoDAO.getAllIPOs();
//		assertEquals(1,ipos.size());
//		//fail("Not yet implemented");
//	}
//	
//	
//	
	@Test
	public void test_save_ipo_success() {
		IPO ipo=new IPO(98,"cts", "stock", 4365.65, 87, LocalDateTime.now(), "remarks");
		assertEquals(true, ipoDAO.saveIPO(ipo));
	}

}
