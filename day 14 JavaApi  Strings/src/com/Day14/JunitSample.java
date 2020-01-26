package com.Day14;

import org.junit.Before;

public class JunitSample {
	public int add(int a,int b) {
		return a+b;
	}
	public int getFactorial(int num) {
		if(num==1)
			return 1;
		else 
			return num*getFactorial(num-1);
		
	}
	//public boolean isprime(int num) {
		
		
	//}
	 
		
}
