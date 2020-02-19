package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.bean.User;
import com.cts.project.dao.UserDAO;

@Transactional
@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateUser(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

//	@Override
//	public boolean saveUser(User user) {
//		try {
//			sessionFactory.getCurrentSession().save(user);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
//
//	@Override
//	public boolean updateUser(User user) {
//		try {
//			sessionFactory.getCurrentSession().update(user);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean deleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(User.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<User> getAllUsers() {
		try {
			List<User> users = sessionFactory.getCurrentSession().createQuery("FROM User").list();
			return users;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
