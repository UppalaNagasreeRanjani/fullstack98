package com.cts.project.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.project.bean.Company;
import com.cts.project.bean.User;
import com.cts.project.dao.CompanyDAO;

@Transactional
@Repository(value = "CompanyDAO")
public class CompanyDAOImpl implements CompanyDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(company);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().delete(company);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Company getCompanyById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Company.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Company> getAllCompanies() {
		try {
			List<Company> companies = sessionFactory.getCurrentSession().createQuery("FROM Company").list();
			return companies;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
