package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.bean.Company;
import com.cts.training.bean.IPO;
import com.cts.training.dao.IPODAO;
@Transactional
@Repository(value = "ipoDAO")
public class IPODAOImpl implements IPODAO{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean saveIPO(IPO ipo) {
		
			try {
				sessionFactory.getCurrentSession().save(ipo);
				return true;
			}catch (HibernateException e) {
				System.out.println("Exception: "+e.getMessage());
				return false;
			}
		
}

		@Override
		public boolean updateIPO(IPO ipo) {
			try {
				sessionFactory.getCurrentSession().update(ipo);
				return true;
			}catch (HibernateException e) {
				System.out.println("Exception: "+e.getMessage());
				return false;
			}
		}

		@Override
		public boolean removeIPO(IPO ipo) {
			try {
				sessionFactory.getCurrentSession().delete(ipo);
				return true;
			}catch (HibernateException e) {
				System.out.println("Exception: "+e.getMessage());
				return false;
			}
		}

		@Override
		public IPO getIPOById(int id) {
			try {
				return sessionFactory.getCurrentSession().get(IPO.class,id);
			
			}catch (HibernateException e) {
				System.out.println("Exception: "+e.getMessage());
				return null;
			}
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<IPO >getAllIPOs() {
			try {
				List<IPO> ipos = sessionFactory.getCurrentSession().createQuery("from IPO").list();
				return ipos;
			}catch (HibernateException e) {
				System.out.println("Exception: "+e.getMessage());
				return null;
			}
		}

		@Override
		public boolean saveOrUpdateIpo(IPO ipo) {
			try {
				sessionFactory.getCurrentSession().saveOrUpdate(ipo);
				return true;
			}catch (HibernateException e) {
				System.out.println("Exception: "+e.getMessage());
				return false;
			}
		}

		
	}