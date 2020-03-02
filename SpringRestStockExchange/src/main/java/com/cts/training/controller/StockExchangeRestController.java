package com.cts.training.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.StockExchange;
@CrossOrigin(origins="*")
@RestController
public class StockExchangeRestController {
	@Autowired
	StockExchangeDAO ur;
	@GetMapping("/stockexchangeall")
	public List<StockExchange> findAll() {
		return ur.findAll();
	}
	
	@GetMapping("/stockexchangeid/{id}")
	public StockExchange findOne(@PathVariable int id) {
		Optional<StockExchange> usr = ur.findById(id);
		StockExchange us = usr.get();
		return us;
	}
	
	@PostMapping("/stockexchangeall")
	public StockExchange save(@RequestBody StockExchange usr) {
		StockExchange us = ur.save(usr);
		return us;
	}
	
	@DeleteMapping("/deletestockexchange/{id}")
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	
	@PutMapping("/updatestockexchange")
	public StockExchange update(@RequestBody StockExchange usr) {
		StockExchange us = ur.save(usr);
		return us;
	}
}
