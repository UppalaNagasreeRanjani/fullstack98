package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.bean.StockPrice;
import com.cts.project.dao.StockPriceDAO;

@Transactional
@Repository(value = "StockPriceDAO")
public class StockPriceDAOImpl implements StockPriceDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateStockPrice(StockPrice Stock) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(Stock);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

//	@Override
//	public boolean updateStockPrice(StockPrice Stock) {
//		try {
//			sessionFactory.getCurrentSession().update(Stock);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean deleteStockPrice(StockPrice Stock) {
		try {
			sessionFactory.getCurrentSession().delete(Stock);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public StockPrice getStockPriceByCode(int comanyCode) {
		try {
			return sessionFactory.getCurrentSession().get(StockPrice.class, comanyCode);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<StockPrice> getAllStockPrice() {
		try {
			List<StockPrice> prices = sessionFactory.getCurrentSession().createQuery("FROM StockPrice").list();
			return prices;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
