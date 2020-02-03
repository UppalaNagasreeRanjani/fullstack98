package com.cts.training.DAOimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.cts.training.dao.impl.Transaction;
import com.cts.training.model.User;

public class UserDAOImpl {
	
	
	
@Override	
public boolean isValidUser(String username,String password) {
	try {
		//Session session=SessionFactory.OpenSession();
		
		Session session = SessionFactory.openSession();
		Transaction tx = session.beginTransaction();
	
	Query query=Session.creteQuery("from user where username=:username and password=:password");
	query.setString("username",username);
	query.setString("password", password);
	User user=(User)query.uniqueResult();
	if(user.getPassword()!=null) {
		tx.commit();
		session.close();
		return true;
		return false;
	}
	
	
}
}
}
