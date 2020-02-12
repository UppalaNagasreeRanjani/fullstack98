package com.cts.training.middle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.model.Company;
import com.cts.training.model.User;

@Controller
public class CompanyController {
@Autowired
CompanyDAO companyDAO;
@GetMapping("/company-home")
public String companyPage(Model model) {
		
	Company company=new Company();	
	model.addAttribute("company",new Company());	
	return "companies";
 }
@PostMapping("/company/save")
public String addCompany(@ModelAttribute("company")Company company) {
	companyDAO.saveOrUpdateCompany(company);
	return "redirect:/company";
}


}