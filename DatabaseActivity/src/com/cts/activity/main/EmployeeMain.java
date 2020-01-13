package com.cts.activity.main;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class EmployeeMain {

	public static void main(String[] args)throws ClassNotFoundException,SQLException  {
	Scanner s=new Scanner(System.in);
//		System.out.println("enter id");
//		int id=Integer.parseInt(s.nextLine());
//		System.out.println("enter name");
//		String name=s.nextLine();
//		System.out.println("enter address");
//		String address=s.nextLine();
//		
		Class.forName("com.mysql.jdbc.Driver");//database driver class
		String url="jdbc:mysql://localhost:3306/cse";//database url
		String username="root";//username
		String password="admin";//password
		Connection conn=DriverManager.getConnection(url,username,password);//connection tothe database
		//String query="insert into e values(?,?,?)";
	//PreparedStatement ps=conn.prepareStatement(query);
	String query="delete from e where id=34";
	Statement stmt=conn.createStatement();
	int result=stmt.executeUpdate(query);
		if(result>0) {
			System.out.println("data deleted successfully");
		}
		else
		{
			System.out.println("try later");
		}
		s.close();
	}
	
		
			
		}
		
		
	


		
		