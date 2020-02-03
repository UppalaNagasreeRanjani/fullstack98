package com.cts.training.dao.impl;

import java.util.List;

<<<<<<< HEAD
import org.hibernate.Session;
import org.hibernate.SessionFactory;

=======
>>>>>>> a989096df1d0e7357435777c29455996cbf612bc
import com.cts.training.dao.IpoDAO;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.Ipo;
import com.cts.training.model.StockExchange;
<<<<<<< HEAD
import com.sun.xml.bind.annotation.OverrideAnnotationOf;
//import com.sun.xml.bind.annotation.OverrideAnnotationOf;

public class IpoDAOimpl implements IpoDAO{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	//@Override
	public boolean saveIpo(Ipo ipo) {
	try {
		Session session = sessionFactory.openSession();
=======

public class IpoDAOimpl implements IpoDAO{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory()();
	@Override
	public boolean saveIpo(Ipo ipo) {
	try {
		session session = sessionFactory.openSession();
>>>>>>> a989096df1d0e7357435777c29455996cbf612bc
		Transaction tx = session.beginTransaction();
		session.save(ipo);
		tx.commit();
		session.close();
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
}

<<<<<<< HEAD

=======
@Override
>>>>>>> a989096df1d0e7357435777c29455996cbf612bc
public boolean updateIpo(Ipo ipo) {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(ipo);
		tx.commit();
		session.close();
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
}



<<<<<<< HEAD
//@Override
=======
@Override
>>>>>>> a989096df1d0e7357435777c29455996cbf612bc
public Ipo getIpoById(int id) {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Ipo ipo = session.get(Ipo.class, id);

		tx.commit();
		session.close();
		return ipo;
	} catch (HibernateException e) {
		e.printStackTrace();
		return null;
	}
}

<<<<<<< HEAD
//@Override
=======
@Override
>>>>>>> a989096df1d0e7357435777c29455996cbf612bc
public List<Ipo> getAllIpo() {
	try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Ipo> ipos = session.createQuery("from IPos").list();
		tx.commit();
		session.close();
		return ipos;
	} catch (HibernateException e) {
		e.printStackTrace();
		return null;
	}
}

}
