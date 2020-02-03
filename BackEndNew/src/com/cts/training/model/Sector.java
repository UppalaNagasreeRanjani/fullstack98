package com.cts.training.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "SectorDetails")
public class Sector implements Serializable {
	@Id
	@Column(name = "sector_id")
	private int id;
	private String sectorname;
	private String breif;
public Sector() {
	
}
public Sector(int id, String sectorname, String breif) {
	super();
	this.id = id;
	this.sectorname = sectorname;
	this.breif = breif;
}
@Override
public String toString() {
	return "Sector [id=" + id + ", sectorname=" + sectorname + ", breif=" + breif + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSectorname() {
	return sectorname;
}
public void setSectorname(String sectorname) {
	this.sectorname = sectorname;
}
public String getBreif() {
	return breif;
}
public void setBreif(String breif) {
	this.breif = breif;
}
public void setEnabled(boolean b) {
	// TODO Auto-generated method stub
	
}

	
}
