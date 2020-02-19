package com.cts.project.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.bean.Company;
import com.cts.project.dao.CompanyDAO;
 
@Controller
public class CompanyController {

	@Autowired
	CompanyDAO companyDAO;

	@GetMapping("/company-home")
	public String CompanyPage(Model model) {
		List<Company> company = companyDAO.getAllCompanies();
		model.addAttribute("companyList", company);
		model.addAttribute("company", new Company());
		return "companies";
	}

	@PostMapping("/company/save")
	public String addCompany(@ModelAttribute("company") Company company) {
		companyDAO.saveOrUpdateCompany(company);
		return "redirect:/company-home";
	}

	@GetMapping("/remove-company/{id}") // {}->path variable
	public String deleteCompany(@PathVariable("id") int id) {
		Company company = companyDAO.getCompanyById(id);
		companyDAO.deleteCompany(company);
		return "redirect:/company-home";
	}

	@GetMapping("/update-company/{id}")
	public String updateCompany(@PathVariable("id") int id, Model model) {
		Company companies = companyDAO.getCompanyById(id);
		model.addAttribute("company", companies);
		List<Company> company = companyDAO.getAllCompanies();
		model.addAttribute("companyList", company);
		return "companies";
	}

}
