package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "register")
@XmlRootElement(name = "reg")
public class Register implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue
	private int id;
	private String username;
	private String email;
	private long phonenumber;
	private String password;
	@Transient
	private String regStatus;
	private String active="no";
	
	
	public Register() {
		
		
	}


	public Register(int id, String username, String email, long phonenumber, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRegStatus() {
		return regStatus;
	}


	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "Register [id=" + id + ", username=" + username + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", password=" + password + "]";
	}


	


	
	

}
