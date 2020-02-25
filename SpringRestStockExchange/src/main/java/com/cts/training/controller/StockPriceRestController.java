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

import com.cts.training.model.IPO;
import com.cts.training.model.StockPrice;
import com.cts.training.repo.IPORepo;
import com.cts.training.repo.StockPriceRepo;

@CrossOrigin(origins="*")
@RestController
public class StockPriceRestController {
	@Autowired
	StockPriceRepo ur;
	@GetMapping("/stockpriceall")
	public List<StockPrice> findAll() {
		return ur.findAll();
	}
	
	@GetMapping("/stockpriceid/{id}")
	public StockPrice findOne(@PathVariable int id) {
		Optional<StockPrice> usr = ur.findById(id);
		StockPrice us = usr.get();
		return us;
	}
	
	@PostMapping("/stockpriceall")
	public StockPrice save(@RequestBody StockPrice usr) {
		StockPrice us = ur.save(usr);
		return us;
	}
	
	@DeleteMapping("/deletestockprice/{id}")
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	
	@PutMapping("/updatestockprice")
	public StockPrice update(@RequestBody StockPrice usr) {
		StockPrice us = ur.save(usr);
		return us;
	}
}
