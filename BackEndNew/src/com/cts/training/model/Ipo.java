package com.cts.training.model;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "IpoPlanned")
public class Ipo implements Serializable {
	@Id
	@Column(name = "ipo_id")
	private int id;
	private String companyname;
	private String stockexchange;
	private int price;
	private int noOfShares;
	private Date date;
	private Time time;
	private String remarks;
public Ipo() {
	
	
}
public Ipo(int id, String companyname, String stockexchange, int price, int noOfShares, Date date, Time time,
		String remarks) {
	super();
	this.id = id;
	this.companyname = companyname;
	this.stockexchange = stockexchange;
	this.price = price;
	this.noOfShares = noOfShares;
	this.date = date;
	this.time = time;
	this.remarks = remarks;
}
public Ipo(int i, String string, String string2, int j, int k, String string3, String string4) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Ipo [id=" + id + ", companyname=" + companyname + ", stockexchange=" + stockexchange + ", price=" + price
			+ ", noOfShares=" + noOfShares + ", date=" + date + ", time=" + time + ", remarks=" + remarks + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getStockexchange() {
	return stockexchange;
}
public void setStockexchange(String stockexchange) {
	this.stockexchange = stockexchange;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getNoOfShares() {
	return noOfShares;
}
public void setNoOfShares(int noOfShares) {
	this.noOfShares = noOfShares;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Time getTime() {
	return time;
}
public void setTime(Time time) {
	this.time = time;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
public void setEnabled(boolean b) {
	// TODO Auto-generated method stub
	
}

	
}
