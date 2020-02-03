package com.cts.training.controller;

import java.util.List;

import com.cts.training.dao.SectorDAO;
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.dao.impl.SectorDAOimpl;
import com.cts.training.dao.impl.StockExchangeDaoImpl;
import com.cts.training.model.Sector;
import com.cts.training.model.StockExchange;

public class SectorController {
	public static void main(String[] args) {

		Sector sector= new Sector(104, "stock","good");

		SectorDAO sectorDAO = new SectorDAOimpl();

// creating table
		boolean sta = sectorDAO.saveSector(sector);
		if (sta) {
			System.out.println("user Saved Successfully");
		} else {
			System.out.println("Try Again");
	}
		
		// updating user
		Sector getstock=sectorDAO.getSectorById(104);
		getstock.setEnabled(true);	
		
	boolean status = sectorDAO.updateSector(sector);
		if (status) {
				System.out.println("Updated successfully");
	}else {
		System.out.println("Try Again");
	}
		
		//deleting user
		
//		Register getUser=userDAO.getUserById(105);
//		boolean status = userDAO.deleteUser(getUser);
//		if(status) {
//			System.out.println("Deleted successfully");
//		}else {
//			System.out.println("Try Again");
//		}
		
		List<Sector> getsectors= sectorDAO.getAllSector();
		getsectors.forEach(System.out::println);
		

	}


}

	


