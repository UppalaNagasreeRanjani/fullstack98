package com.cts.training.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Entity
@Table(name="company")
//@XmlRootElement(name = "company")
public class Company {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String ceo;
	private String board_of_directors;
	private String listed_in_stock_exchanges;
	private String sector;
	private double turnover;
	private String brief;
	private String stock_code;
	
	public Company() {
	 super();		
	}

	public Company(int id, String name, String ceo, String board_of_directors, String listed_in_stock_exchanges,
			String sector, double turnover, String brief, String stock_code) {
		super();
		this.id = id;
		this.name = name;
		this.ceo = ceo;
		this.board_of_directors = board_of_directors;
		this.listed_in_stock_exchanges = listed_in_stock_exchanges;
		this.sector = sector;
		this.turnover = turnover;
		this.brief = brief;
		this.stock_code = stock_code;
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

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoard_of_directors() {
		return board_of_directors;
	}

	public void setBoard_of_directors(String board_of_directors) {
		this.board_of_directors = board_of_directors;
	}

	public String getListed_in_stock_exchanges() {
		return listed_in_stock_exchanges;
	}

	public void setListed_in_stock_exchanges(String listed_in_stock_exchanges) {
		this.listed_in_stock_exchanges = listed_in_stock_exchanges;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getStock_code() {
		return stock_code;
	}

	public void setStock_code(String stock_code) {
		this.stock_code = stock_code;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", ceo=" + ceo + ", board_of_directors=" + board_of_directors
				+ ", listed_in_stock_exchanges=" + listed_in_stock_exchanges + ", sector=" + sector + ", turnover="
				+ turnover + ", brief=" + brief + ", stock_code=" + stock_code + "]";
	}

	
	
	
	}
