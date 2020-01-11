package com.cts.activity.main;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.util.Scanner;



public class EmployeeMain {

	public static void main(String[] args)throws ClassNotFoundException,SQLException  {
		Scanner s=new Scanner(System.in);
		System.out.println("enter id");
		int id=Integer.parseInt(s.nextLine());
		System.out.println("enter name");
		String name=s.nextLine();
		
		Class.forName("com.mysql.jdbc.Driver");//database driver class
		String url="jdbc:mysql://localhost:3306/cts";//database url
		String username="root";//username
		String password="admin";//password
		Connection conn=DriverManager.getConnection(url,username,password);//connection tothe database
		String query="insert into emp values(?,?)";
	PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("data inserted successfully");
		}
		else
		{
			System.out.println("try later");
		}
		s.close();
	}
	
		
			
		}
		
		
	


		
		