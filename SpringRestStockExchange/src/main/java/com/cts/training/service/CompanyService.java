package com.cts.training.service;

import java.util.List;


import com.cts.training.model.Company;

public interface CompanyService {
	public Company insert(Company company);
	public void delete(int id);
	public Company updateCompany(Company companies);
	public List<Company> getAllCompanies();
	public Company getCompanyById(int id);
	//public String activate(String email);
}
