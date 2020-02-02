package com.cts.training.dao.impl;

import java.util.List;

import com.cts.training.dao.SectorDAO;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.Sector;
import com.cts.training.model.StockExchange;

public class SectorDAOimpl implements SectorDAO{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	@Override
	public boolean saveSector(Sector sector) {
	try {
		session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(sector);
		tx.commit();
		session.close();
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
}
	@Override
public boolean updateSector(Sector sector) {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(sector);
		tx.commit();
		session.close();
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
}


	@Override
public Sector getSectorById(int id) {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Sector sector = session.get(Sector.class, id);

		tx.commit();
		session.close();
		return sector;
	} catch (HibernateException e) {
		e.printStackTrace();
		return null;
	}
}

@Override
public List<Sector> getAllSector() {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Sector> sectors = session.createQuery("from Sector").list();
		tx.commit();
		session.close();
		return sectors;
	} catch (HibernateException e) {
		e.printStackTrace();
		return null;
	}
}

}
