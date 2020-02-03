package com.cts.training.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
//@Table(name="employee")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="employee-type",discriminatorType = DiscriminatorType.STRING,length=2)
//@DiscriminatorValue(value="E")
//@Inheritance(strategy =InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {
	@Id
		//@GeneratedValue
		//@Column(name="id")
		//@Column(name="name")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String name;
//		@ElementCollection(fetch = FetchType.LAZY )
//		List<String> emails;
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
//		public List<String> getEmails() {
//			return emails;
//		}
//		public void setEmails(List<String> emails) {
//			this.emails = emails;
//		}
//	

}
