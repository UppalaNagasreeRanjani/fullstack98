package com.cts.training.controller;
import java.util.List;
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.dao.impl.StockExchangeDaoImpl;
import com.cts.training.model.StockExchange;

public class StockMarketControler {
	public static void main(String[] args) {

		StockExchange stock = new StockExchange(104, "pavan", "nehunagar","good");

		StockExchangeDAO stockDAO = new StockExchangeDaoImpl();

// creating table
		boolean sta = stockDAO.saveStockExchange(stock);
		if (sta) {
			System.out.println("user Saved Successfully");
		} else {
			System.out.println("Try Again");
	}
		
		// updating user
		StockExchange getstock=stockDAO.getStockById(104);
		getstock.setEnabled(true);	
		
	boolean status = stockDAO.updateStockExchange(stock);
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
		
		List<StockExchange> getstocks= stockDAO.getAllStock();
		getstocks.forEach(System.out::println);
		

	}


}

	


