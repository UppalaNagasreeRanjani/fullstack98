package com.cts.training.companyservice;

import java.util.List;


//import com.cts.training.model.Company;

public interface CompanyService {
	public Company insert(Company company);
	public void deleteById(int id);
	public Company update(Company companys);
	public List<Company> getAllCompanys();
	public Company getElementById(int id);
	//public String activate(String email);
}
