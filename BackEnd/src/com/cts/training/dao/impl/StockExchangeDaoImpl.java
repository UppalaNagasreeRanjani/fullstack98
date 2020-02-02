package com.cts.training.dao.impl;

import java.util.List;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.Register;
import com.cts.training.model.StockExchange;

public class StockExchangeDaoImpl implements StockExchangeDAO {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory()();
	@Override
	public boolean saveStockExchange(StockExchange stock) {
	try {
		session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(stock);
		tx.commit();
		session.close();
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
}

@Override
public boolean updateStockExchange(StockExchange stock) {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(stock);
		tx.commit();
		session.close();
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
}



@Override
public StockExchange getStockExchangeById(int id) {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		StockExchange stock = session.get(StockExchange.class, id);

		tx.commit();
		session.close();
		return stock;
	} catch (HibernateException e) {
		e.printStackTrace();
		return null;
	}
}

@Override
public List<StockExchange> getAllStock() {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<StockExchange> stocks = session.createQuery("from StockExchange").list();
		tx.commit();
		session.close();
		return stocks;
	} catch (HibernateException e) {
		e.printStackTrace();
		return null;
	}
}
}
