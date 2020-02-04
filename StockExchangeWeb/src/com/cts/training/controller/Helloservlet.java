package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/helloservlet")//name of servlet
public class Helloservlet extends HttpServlet  
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
		PrintWriter out=response.getWriter();
		//out.println("hello to servlet");
		int id=Integer.parseInt(request.getParameter("id"));
		String user=request.getParameter("user");//it is the which is provided in html name in form
		String pass=request.getParameter("pass");
		String repass=request.getParameter("repass");
		String email=request.getParameter("email");
		long phone=Long.parseLong(request.getParameter("phone"));
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cse";
			String username="root";
			String password="admin";
			Connection conn=DriverManager.getConnection(url,username,password);
			String sql = "INSERT INTO example VALUES (?, ?, ?, ?, ?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setString(2, user);
			statement.setString(3,pass);
			statement.setString(4, repass);
			statement.setString(5, email);
			statement.setLong(6, phone);
			
			
			
			statement.executeUpdate();
		
			
			out.println("id is"+id+"Username is "+ user + " \n<br>PassWord is " + pass+"\n<br>reEnteredPassword is "+repass+"Mail id is" +email+"Phone number is"+phone);
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request, response);
			statement.cancel();
			conn.close();
			
	} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
