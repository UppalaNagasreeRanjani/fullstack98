package com.Day13;

public class LambdaExp {
	public static void main(String[] args) {
		Hello h=( int a,int b )-> a+b;

		
			System.out.println(h.add(39, 45));
		}
		
	}


interface Hello{
	public int add(int a,int b);
}