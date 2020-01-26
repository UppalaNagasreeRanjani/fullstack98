package com.Day14;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
//import org.junit.Ignore;
import org.junit.Test;

//import com.sun.crypto.provider.AESCipher.General;

public class sampleTest {
	JunitSample api=null;
	@Before
	public void start() {
		api=new JunitSample();
		System.out.println("general");
		
	}
	@After
	public void destroy()
	{
api=null;
System.out.println("general destroyed");
}
	
	@Test
	public void testAddNumbers()
	{
		assertEquals(12,api.add(6,6));
	}
	@Test
	public void  testgetFactorial() {
		assertEquals(6,api.getFactorial(3));
	}
	

	

}
