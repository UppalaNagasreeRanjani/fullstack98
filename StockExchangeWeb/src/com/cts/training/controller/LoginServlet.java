package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet   {
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
}
}