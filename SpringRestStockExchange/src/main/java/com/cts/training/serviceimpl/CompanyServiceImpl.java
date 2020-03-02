package com.cts.training.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.RegisterDAO;
import com.cts.training.model.Company;
import com.cts.training.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
	@Autowired
	RegisterDAO registerDAO;
	@Autowired
	JavaMailSender javaMail;
	@Autowired
	CompanyDAO ur;
	
	@GetMapping("/companyall")
	public List<Company> findAll() {
		return ur.findAll();
	}
	
	@GetMapping("/companyid/{id}")
	public Company findOne(@PathVariable int id) {
		Optional<Company> usr = ur.findById(id);
		Company us = usr.get();
		return us;
	}
	
	@PostMapping("/companyall")
	public Company save(@RequestBody Company usr) {
		Company us = ur.save(usr);
		return us;
	}
	
	@DeleteMapping("/deletecompany/{id}")
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	
	@PutMapping("/updatecompany")
	public Company update(@RequestBody Company usr) {
		Company us = ur.save(usr);
		return us;
	}

}
