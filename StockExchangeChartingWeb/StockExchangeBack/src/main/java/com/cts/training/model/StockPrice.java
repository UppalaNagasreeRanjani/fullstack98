package com.cts.training.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "stockprice")
@Component
public class StockPrice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6893738367295298635L;
	
	@Id
	private int id;
	private int companyId;
	private double currentPrice;
	private LocalDateTime openDateTime;
	
	
	public StockPrice(int id, int companyId, double currentPrice,LocalDateTime openDateTime) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.currentPrice = currentPrice;
		this.openDateTime = openDateTime;
		
	}
	public StockPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public LocalDateTime getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'H:m");
		this.openDateTime=LocalDateTime.parse(openDateTime, formatter);
	}
	
	
	@Override
	public String toString() {
		return "StockPrice [id=" + id + ", companyId=" + companyId + ", currentPrice=" + currentPrice
				+ ", openDateTime=" + openDateTime + "]";
	}

	
	
}
