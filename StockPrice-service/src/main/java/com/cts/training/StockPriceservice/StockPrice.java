package com.cts.training.StockPriceservice;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "stockprices")
@Component(value="stockprice")
public class StockPrice {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String stock_exchange;
	private double current_price;
	private LocalDateTime opendatetime;
	public StockPrice() {
		
	}
	public StockPrice(int id, String stock_exchange, double current_price, 
			LocalDateTime opendatetime) {
		super();
		this.id = id;
		this.stock_exchange = stock_exchange;
		this.current_price = current_price;
		
		this.opendatetime = opendatetime;
	}
	public int getid() {
		return id;
	}
	public void setCompany_id(int id) {
		this.id = id;
	}
	public String getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public double getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}
	
	public LocalDateTime getOpendatetime() {
		return opendatetime;
	}
	public void setOpendatetime(LocalDateTime opendatetime) {
		this.opendatetime = opendatetime;
	}
	@Override
	public String toString() {
		return "StockPrice [id=" + id + ", stock_exchange=" + stock_exchange + ", current_price="
				+ current_price + ", opendatetime=" + opendatetime + "]";
	}
	
}
