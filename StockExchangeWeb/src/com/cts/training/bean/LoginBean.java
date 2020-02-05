package com.cts.training.bean;

import javax.servlet.http.HttpServlet;

public class LoginBean extends HttpServlet {
private String username;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
