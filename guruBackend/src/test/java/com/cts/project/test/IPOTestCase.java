package com.cts.project.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.project.bean.IPODetailEntry;
import com.cts.project.dao.IPODetailEntryDAO;

public class IPOTestCase {

	private static AnnotationConfigApplicationContext context;
	private static IPODetailEntryDAO ipoDAO;
	private static IPODetailEntry ipo;

	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.project");
		context.refresh();
		ipo = (IPODetailEntry) context.getBean("ipo");
		ipoDAO = (IPODetailEntryDAO) context.getBean("ipoDAO");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
