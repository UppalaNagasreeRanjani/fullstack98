package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class LoginServlet extends HttpServlet   {
	public static boolean validate(String user,String pass){
		boolean status=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","admin");
			PreparedStatement ps=con.prepareStatement("select * from example where email=? and password=?");
		ps.setString(1,user);
		ps.setString(2,pass);
		ResultSet rs=ps.executeQuery();
		status=rs.next();
		}catch(Exception e){System.out.println(e);}
		return status;
		}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		Login ldb=new Login();
	    if(ldb.validate(user, pass)){
	        RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
	        rd.forward(request,response);
	    }
	    else{
	        out.print("Sorry username or password error");
	        RequestDispatcher rd=request.getRequestDispatcher("login.html");
	        rd.include(request,response);
	    }
	    out.close();
}
}