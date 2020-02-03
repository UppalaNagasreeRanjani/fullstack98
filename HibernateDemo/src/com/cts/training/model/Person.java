package com.cts.training.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue
	
	private int id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)//one to one 
	@JoinColumn(name="passport_id")// this is used to map between two tables with out this also by defaulu it takes passportdetails
	private PassportDetails passport;//this is mapping one oject to other Or we can dothe same operations in passport one to one for person
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
	public PassportDetails getPassport() {
		return passport;
	}
	public void setPassport(PassportDetails passport) {
		this.passport = passport;
	}
	

}
