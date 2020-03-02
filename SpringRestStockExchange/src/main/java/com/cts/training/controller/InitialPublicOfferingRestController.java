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

import com.cts.training.dao.InitialPublicOfferingDAO;
import com.cts.training.model.InitialPublicOffering;
	
	@CrossOrigin(origins="*")
	@RestController
	public class InitialPublicOfferingRestController {
		
		@Autowired
		InitialPublicOfferingDAO ur;
		
		@GetMapping("/ipoall")
		public List<InitialPublicOffering> findAll() {
			return ur.findAll();
		}
		
		@GetMapping("/ipoid/{id}")
		public InitialPublicOffering findOne(@PathVariable int id) {
			Optional<InitialPublicOffering> usr = ur.findById(id);
			InitialPublicOffering us = usr.get();
			return us;
		}
		
		@PostMapping("/ipoall")
		public InitialPublicOffering save(@RequestBody InitialPublicOffering usr) {
			InitialPublicOffering us = ur.save(usr);
			return us;
		}
		
		@DeleteMapping("/deleteipo/{id}")
		public void delete(@PathVariable int id) {
			ur.deleteById(id);
		}
		
		@PutMapping("/updateipo")
		public InitialPublicOffering update(@RequestBody InitialPublicOffering usr) {
			InitialPublicOffering us = ur.save(usr);
			return us;
		}
	}



