package com.cts.training.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "ipos")
@Component(value="ipo")
public class IPO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String company_name;
	private String stock_exchange;
	private double price_per_share;
	private double total_shares;
	private LocalDateTime opendatetime;
	private String remarks;
	public IPO() {
		
	}
	public IPO(int id, String company_name, String stock_exchange, double price_per_share, double total_shares,
			LocalDateTime opendatetime, String remarks) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.stock_exchange = stock_exchange;
		this.price_per_share = price_per_share;
		this.total_shares = total_shares;
		this.opendatetime = opendatetime;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public double getPrice_per_share() {
		return price_per_share;
	}
	public void setPrice_per_share(double price_per_share) {
		this.price_per_share = price_per_share;
	}
	public double getTotal_shares() {
		return total_shares;
	}
	public void setTotal_shares(double total_shares) {
		this.total_shares = total_shares;
	}
	public LocalDateTime getOpendatetime() {
		return opendatetime;
	}
	public void setOpendatetime(LocalDateTime opendatetime) {
		this.opendatetime = opendatetime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPO [id=" + id + ", company_name=" + company_name + ", stock_exchange=" + stock_exchange
				+ ", price_per_share=" + price_per_share + ", total_shares=" + total_shares + ", opendatetime="
				+ opendatetime + ", remarks=" + remarks + "]";
	}
	
	}
