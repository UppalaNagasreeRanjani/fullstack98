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
import com.cts.training.repo.IPORepo;
	
	@CrossOrigin(origins="*")
	@RestController
	public class IPORestController {
		
		@Autowired
		IPORepo ur;
		
		@GetMapping("/ipoall")
		public List<IPO> findAll() {
			return ur.findAll();
		}
		
		@GetMapping("/ipoid/{id}")
		public IPO findOne(@PathVariable int id) {
			Optional<IPO> usr = ur.findById(id);
			IPO us = usr.get();
			return us;
		}
		
		@PostMapping("/ipoall")
		public IPO save(@RequestBody IPO usr) {
			IPO us = ur.save(usr);
			return us;
		}
		
		@DeleteMapping("/deleteipo/{id}")
		public void delete(@PathVariable int id) {
			ur.deleteById(id);
		}
		
		@PutMapping("/updateipo")
		public IPO update(@RequestBody IPO usr) {
			IPO us = ur.save(usr);
			return us;
		}
	}



