package com.cts.training.controller;

import java.util.List;

import com.cts.training.dao.IpoDAO;
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.dao.impl.IpoDAOimpl;
import com.cts.training.dao.impl.StockExchangeDaoImpl;
import com.cts.training.model.Ipo;
import com.cts.training.model.StockExchange;

public class IpoController {
	public static void main(String[] args) {

		Ipo ipo = new Ipo(45,"cts","gsjhg",67785,656,"66-7777-77","56.7");

		IpoDAO ipoDAO = new IpoDAOimpl();

// creating table
		boolean sta = ipoDAO.saveIpo(ipo);
		if (sta) {
			System.out.println("user Saved Successfully");
		} else {
			System.out.println("Try Again");
	}
		
		// updating user
		Ipo getipo=ipoDAO.getIpoById(104);
		getipo.setEnabled(true);	
		
	boolean status = ipoDAO.updateIpo(ipo);
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
		
		List<Ipo> getipos= ipoDAO.getAllIpo();
		getipos.forEach(System.out::println);
		

	}


}

	

