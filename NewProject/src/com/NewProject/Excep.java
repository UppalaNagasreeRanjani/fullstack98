package com.NewProject;

public class Excep
{
	public static void show() throws  NullPointerException {
		
		int a=10,b=20;
		 b=10/(b-a);
		System.out.println(b);
		String name="sri";
		name=null;
		System.out.println(name);
		}
	
	public static void main(String[] args) {
	 

			try {
				show();
			}
			catch(NullPointerException e) {
				System.out.println("exception raised");
			}
	}
	
	
}