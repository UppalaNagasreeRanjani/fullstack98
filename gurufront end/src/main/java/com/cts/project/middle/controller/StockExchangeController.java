package com.cts.project.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.bean.StockExchange;
import com.cts.project.dao.StockExchangeDAO;

@Controller
public class StockExchangeController {

	@Autowired
	StockExchangeDAO stockExchangeDAO;

	@GetMapping("/stockExchange-home")
	public String stockExchangePage(Model model) {
		List<StockExchange> stockExchanges = stockExchangeDAO.getStockExchange();
		model.addAttribute("exchange", stockExchanges);
		model.addAttribute("stockExchange", new StockExchange());
		return "stockExchanges";
	}

	@PostMapping("/exchange/save")
	public String addStockExchange(@ModelAttribute("stockExchange") StockExchange stockExchange) {
		stockExchangeDAO.saveOrUpdateStockExchange(stockExchange);
		return "redirect:/stockExchange-home";
	}

	@GetMapping("/remove-exchange/{id}")
	public String deleteStockExchange(@PathVariable("id") int id) {
		StockExchange stockExchange = stockExchangeDAO.getStockExchangeById(id);
		stockExchangeDAO.deleteStockExchange(stockExchange);
		return "redirect:/stockExchange-home";
	}

	@GetMapping("/update-exchange/{id}")
	public String updateStockExchange(@PathVariable("id") int id, Model model) {
		StockExchange stockExchange = stockExchangeDAO.getStockExchangeById(id);
		model.addAttribute("stockExchange", stockExchange);
		List<StockExchange> stockExchanges = stockExchangeDAO.getStockExchange();
		model.addAttribute("exchange", stockExchanges);
		return "stockExchanges";
	}

}
