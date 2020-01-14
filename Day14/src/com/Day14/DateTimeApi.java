package com.Day14;

import java.util.Date;

public class DateTimeApi {
	public static void main(String[] args) {
		Date date=new Date();
		//System.out.println(date);
		int day=date.getDate();
		System.out.println(day);
		int day1=date.getDay();
		
		
		System.out.println(date);//it will return the current date in the system
		switch(day1){
			case 0:System.out.println("sunday");
			break;
			case 1:System.out.println("monday");
			break;
			case 2:System.out.println("tuesday");
			break;
			case 3:System.out.println("wednessday");
			break;
			case 4:System.out.println("thursday");
			break;
			case 5:System.out.println("fridayday");
			break;
			case 6:System.out.println("saturday");
			break;
			default:System.out.println("invalid");
			
			
		}
	}

}
