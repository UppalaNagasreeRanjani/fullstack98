package Assesment1.com;

import java.util.Scanner;

public class StringNotAlloWNumbers {
	public static void main(String[] args)	{
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		 int year=Integer.parseInt(s.nextLine());
		 boolean value=true;
		 
		 for(int i=0;i<name.length();i++) {
			 char ch=name.charAt(i);
			 if((ch>'a'&& ch<'z') ||(ch>'A'&&ch>'Z')) {
				value=true; 
			 }
			 else {
				 value=false;
			 }
		 }
			 if(value) {
				 try {
					 System.out.println("my name is  "+name+"and  graduation year is"+year);
				 }
				 catch(Exception e) {
					 System.out.println("enter your name properly");
				 }
			 }
				 else {
					 System.out.println("enter your number correctly");
				 }
			 }
		 }
		 
		
		 
		 
 	 
		 
	
	
	
	

