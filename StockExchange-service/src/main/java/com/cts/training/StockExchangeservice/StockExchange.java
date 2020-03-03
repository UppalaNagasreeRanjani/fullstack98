package com.cts.training.StockExchangeservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="stockexchange")
public class StockExchange {
	
@Id
@GeneratedValue
	private int id;
	private String name;
	private String address;
	private String brief;
	private String remarks;

	public StockExchange() {
		
		
	}

	public StockExchange(int id, String name, String address, String brief, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.brief = brief;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", name=" + name + ", address=" + address + ", brief=" + brief + ", remarks="
				+ remarks + "]";
	}

	
}
