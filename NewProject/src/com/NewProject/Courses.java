package com.NewProject;

import java.util.Scanner;

public class Courses {
public static void main(String[] args) {
	System.out.println("1.java           5000");
	System.out.println("2.c          2000");
	System.out.println("3.cpp           3000");
	System.out.println("4.python          4000");
	System.out.println("5.angular           6000");
	StringBuffer sb=new StringBuffer();
	Scanner s=new Scanner(System.in);
	String ch=s.nextLine();
	String choice=ch;
	System.out.println("enter course");
	int p=0;
	if(ch.contains("java")) {
		sb.append("1.java           5000");
		System.out.println(sb);
		p=p+5000;
	}
	if(ch.contains("c")) {
		sb.append("2.c          2000");
	
		p=p+2000;
	}
	if(ch.contains("cpp")) {
		sb.append("3.cpp           3000");
		p=3000;
		System.out.println(sb);
	}
	if(ch.contains("python")) {
		sb.append("4.python          4000");
		p=p+4000;
		System.out.println(sb);
	}
	if(ch.contains("angular")) {
		sb.append("5.angular           6000");
		p=p+6000;
	}
	System.out.println(p);
	
	
		
	
	
	
	
	
	
	
	
	
	}

	
			
			
		
}

