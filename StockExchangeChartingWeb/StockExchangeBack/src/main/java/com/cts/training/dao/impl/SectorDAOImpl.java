package com.cts.training.dao.impl;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.SectorDAO;
import com.cts.training.model.Register;
import com.cts.training.model.Sector;

@Transactional
@Repository(value="sectorDAO")

public class SectorDAOImpl implements SectorDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addOrUpdateSector(Sector sector) {
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(sector);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

//	@Override
//	public boolean updateSector(Sector sector) {
//		try {
//			
//			sessionFactory.getCurrentSession().update(sector);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean deleteSector(Sector sector) {
		try {
			
			sessionFactory.getCurrentSession().delete(sector);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Sector getSectorById(int id) {
		try {
			
			return sessionFactory.getCurrentSession().get(Sector.class,id);
		
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Sector> getAllSectors() {
		try {
			
			
			List<Sector> sectors = sessionFactory.getCurrentSession().createQuery("FROM Sector").list();
			
			return sectors;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
