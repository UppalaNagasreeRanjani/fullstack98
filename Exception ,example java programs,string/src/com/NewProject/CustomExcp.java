package com.NewProject;

public class CustomExcp {
	public static boolean isValidUser(String name)throws InvalidUser{
		if(!name.equals("naga")) {
			throw new InvalidUser();
		
		}
		return true;
	}
	public static void main(String[] args) {
		try {
			isValidUser("naa");
		}
		catch(InvalidUser e) {
			System.out.println(e.getMessage());
		}
}
	
}
	class InvalidUser extends Exception{
		public InvalidUser() {
			// TODO Auto-generated constructor stub
		}
		InvalidUser(String name){
			System.out.println("invalid userga");
			
		}
		public String getMessage() {
			
			return "this is invalid user";
		}
		
		
	}

