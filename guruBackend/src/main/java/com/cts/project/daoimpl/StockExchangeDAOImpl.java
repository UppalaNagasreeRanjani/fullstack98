package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.bean.StockExchange;
import com.cts.project.dao.StockExchangeDAO;

@Transactional
@Repository(value = "StockExchangeDAO")
public class StockExchangeDAOImpl implements StockExchangeDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateStockExchange(StockExchange Exchange) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(Exchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

//	@Override
//	public boolean updateStockExchange(StockExchange Exchange) {
//		try {
//			sessionFactory.getCurrentSession().update(Exchange);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean deleteStockExchange(StockExchange Exchange) {
		try {
			sessionFactory.getCurrentSession().delete(Exchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public StockExchange getStockExchangeById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(StockExchange.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<StockExchange> getStockExchange() {
		try {
			List<StockExchange> exchange = sessionFactory.getCurrentSession().createQuery("FROM StockExchange").list();
			return exchange;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
