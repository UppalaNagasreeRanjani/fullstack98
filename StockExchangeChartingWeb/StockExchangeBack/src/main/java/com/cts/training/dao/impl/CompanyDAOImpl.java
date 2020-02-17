package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.model.Company;
import com.cts.training.model.Register;
@Transactional
@Repository(value="companyDAO")
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

//	@Override
//	public boolean updateCompany(Company company) {
//		try {
//			sessionFactory.getCurrentSession().update(company);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

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
	public Company getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Company.class,id);
			
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	public List<Company> getAllCompany() {
		try {
			
			List<Company> company = sessionFactory.getCurrentSession().createQuery("from Company").list();
			return company;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}



}
