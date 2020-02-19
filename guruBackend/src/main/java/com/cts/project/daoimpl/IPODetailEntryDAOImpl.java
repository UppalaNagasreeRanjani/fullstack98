package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.bean.IPODetailEntry;
import com.cts.project.dao.IPODetailEntryDAO;

@Transactional
@Repository(value = "IPODetailsEntryDAO")
public class IPODetailEntryDAOImpl implements IPODetailEntryDAO {

	@Autowired
	SessionFactory sessionFactory;

//	@Override
//	public boolean saveAndUpdateIPODeatail(IPODetailEntry IPODetail) {
//		try {
//			sessionFactory.getCurrentSession().save(IPODetail);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean saveOrUpdateIPODeatail(IPODetailEntry IPODetail) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(IPODetail);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteIPODetail(IPODetailEntry IPODetail) {
		try {
			sessionFactory.getCurrentSession().delete(IPODetail);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public IPODetailEntry getIPODetailById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(IPODetailEntry.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<IPODetailEntry> getAllIPODetails() {
		try {
			List<IPODetailEntry> list = sessionFactory.getCurrentSession().createQuery("FROM IPODetailEntry").list();
			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
