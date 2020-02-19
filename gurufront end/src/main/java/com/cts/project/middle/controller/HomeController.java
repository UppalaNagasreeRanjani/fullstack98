package com.cts.project.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.project.bean.IPODetailEntry;
import com.cts.project.bean.StockExchange;
import com.cts.project.bean.StockPrice;
import com.cts.project.bean.User;
import com.cts.project.dao.IPODetailEntryDAO;
import com.cts.project.dao.StockExchangeDAO;
import com.cts.project.dao.StockPriceDAO;
import com.cts.project.dao.UserDAO;

@Controller
public class HomeController {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private StockPriceDAO stockPriceDAO;
	@Autowired
	private IPODetailEntryDAO ipoDetailsEntry;
	@Autowired
	private StockExchangeDAO stockExchangeDAO;

	// any of the two annotations can be used.
	// @GetMapping("/")
	// OR
	@RequestMapping(value = { "/", "/home" })
	public String indexPage(Model model) {
		model.addAttribute("message", "Wecome to Spring MVC");
//		List<String> names = new ArrayList<String>();
//		addNames(names);
//		model.addAttribute("list", names);

		List<User> users = userDAO.getAllUsers();
		model.addAttribute("list", users);
		return "index";
	}

//	private void addNames(List<String> names) {
//		names.add("Divya");
//		names.add("Hameem");
//		names.add("guru");
//		names.add("syed");
//		names.add("vishnavi");
//
//	}

	@RequestMapping("/stockPrice")
	public String StockPricePage(Model model) {
		model.addAttribute("message", "Stock Price Details");
//		StockPrice stockPrice= new StockPrice(111, "yes", 83746538, null, null);
//		stockPriceDAO.saveStockPrice(stockPrice);
		List<StockPrice> price = stockPriceDAO.getAllStockPrice();
		model.addAttribute("prices", price);
		return "StockPrice";
	}

	@RequestMapping("/ipoDetails")
	public String IPODetailsPage(Model model) {
		model.addAttribute("message", "IPO Details");
		List<IPODetailEntry> ipoDetails = ipoDetailsEntry.getAllIPODetails();
		model.addAttribute("ipo", ipoDetails);
		return "ipoDetails";
	}

	@RequestMapping("/stockExchange")
	public String StockExchangepage(Model model) {
		model.addAttribute("message", "Stock Exchange");
//		StockExchange stock = new StockExchange(234, "asdasd", "goooddd", "asdjsajda", "kajsdkjhsadkjad");
//		stockExchangeDAO.saveStockExchange(stock);
		List<StockExchange> stockExchange = stockExchangeDAO.getStockExchange();
		model.addAttribute("exchange", stockExchange);
		return "stockExchange";
	}

}
