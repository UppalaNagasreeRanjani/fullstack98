package com.NewProject;

public class Practise {
	public static void main(String[] args) {
		String name="Global Warming";
		System.out.println(name.substring(10));
		System.out.println(name.substring(4,8));
		System.out.println(name.matches("[a-zA-Z0-9]+"));
		StringBuffer ab=new StringBuffer(name);
		System.out.println(ab.delete(10,14));
		System.out.println(name.substring(4));
	
		System.out.println(name.indexOf("Wa"));
		System.out.println(name.substring(10));
		//System.out.println(name.toUpperCase());
		System.out.println(name.replace("a","*"));			
	}

}