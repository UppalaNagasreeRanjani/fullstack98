package com.cts.training.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name="employee")
@Table(name="permanent")
//@DiscriminatorValue(value="PE")
//@PrimaryKeyJoinColumn(name="emp-id")
@AttributeOverrides({
@AttributeOverride(name="id",column=@Column(name="id")),
@AttributeOverride(name="name",column=@Column(name="name")),

})
public class PermanentEmployee extends Employee {
	private double salary;
	private float bonus;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
//	@Override
//	public String toString() {
//		return "PermanentEmployee [salary=" + salary + ", bonus=" + bonus + ", emails=" + emails + ", getSalary()="
//				+ getSalary() + ", getBonus()=" + getBonus() + ", getId()=" + getId() + ", getName()=" + getName()
//				+ ", getEmails()=" + getEmails() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}
	

}
