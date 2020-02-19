package com.cts.project.dao;

import java.util.List;

import com.cts.project.bean.Company;


public interface CompanyDAO {

	public boolean saveOrUpdateCompany(Company company);

	public boolean deleteCompany(Company company);

	public Company getCompanyById(int id);

	public List<Company> getAllCompanies();

}
