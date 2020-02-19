package com.cts.project.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.bean.StockPrice;
import com.cts.project.dao.StockPriceDAO;

@Controller
class StockPriceController {

	@Autowired
	StockPriceDAO stockPriceDAO;

	@GetMapping("/stockPrice-home")
	public String stockPricePage(Model model) {
		List<StockPrice> price = stockPriceDAO.getAllStockPrice();
		model.addAttribute("price", price);
		model.addAttribute("stockPrice", new StockPrice());
		return "stockPrices";
	}

	@PostMapping("/stockPrice/save")
	public String saveOrUpdateStockPrice(@ModelAttribute("stockPrice") StockPrice stockPrice) {
		stockPriceDAO.saveOrUpdateStockPrice(stockPrice);
		return "redirect:/stockPrice-home";
	}

	@GetMapping("remove-stockPrice/{companyCode}")
	public String deleteStockPrice(@PathVariable("companyCode") int companyCode) {
		StockPrice stockPrice = stockPriceDAO.getStockPriceByCode(companyCode);
		stockPriceDAO.deleteStockPrice(stockPrice);
		return "redirect:/stockPrice-home";
	}

	@GetMapping("/update-stockPrice/{companyCode}")
	public String updateStockPrice(@PathVariable("companyCode") int companyCode, Model model) {
		StockPrice stockPrice = stockPriceDAO.getStockPriceByCode(companyCode);
		model.addAttribute("stockPrice", stockPrice);
		List<StockPrice> price = stockPriceDAO.getAllStockPrice();
		model.addAttribute("price", price);
		return "stockPrices";
	}

}
