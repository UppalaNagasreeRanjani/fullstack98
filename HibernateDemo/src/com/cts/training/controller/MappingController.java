package com.cts.training.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.criterion.Restrictions;

//import com.cts.training.model.Actor;
import com.cts.training.model.Developer;
//import com.cts.training.model.Movie;
//import com.cts.training.model.PassportDetails;
//import com.cts.training.model.Person;
import com.cts.training.model.Technology;



public class MappingController {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		
		
//		Criteria criteria=session.createCriteria(Person.class);// to get the data matched in the console
//	List<Person>persons=criteria.add(Restrictions.eq("name","nagasri")).list();
//	for(Person p:persons) {
//		System.out.println(p.getPassport().getPassportNumber());
//	}//criterai
//	Person p=new Person();//one to one
//	p.setName("nagasri");
//	PassportDetails pd=new PassportDetails();
//	pd.setPassportNumber("54564");
//	p.setPassport(pd);
//	session.save(p);//one to one
//		Movie movie= new Movie();
//		movie.setName("alavikuntapuramlo");
//        movie.setMovie(movie);
//        Movie movie1=new Movie();
//        movie1.setMovie(movie1);
//		Actor actor1 = new Actor();
//		actor1.setActorName("alluarjun");
//		//actor1.setMovie(movie);
//
//		Actor actor2= new Actor();
//		actor2.setActorName("navadeep");
//	//	actor2.setMovie(movie);
//		session.save(movie);
//		session.save(actor1);
//		session.save(actor2);
//		Criteria criteria = session.createCriteria(Actor.class);
//		criteria.add(Restrictions.eq("alluarjun", "arya2"));
//		Actor actor = (Actor) criteria.uniqueResult();
//
//		System.out.println(actor);
//		System.out.println(actor.getMovie());
		Developer developer1= new Developer();
		developer1.setName("Vishal");

		Developer developer2= new Developer();
		developer2.setName("Yogesh");

		Developer developer3= new Developer();
		developer3.setName("vira");

		Technology technology1=new Technology();
		technology1.setLanguage("Java");
		technology1.setExpertise("Intermediate");

		Technology technology2=new Technology();
		technology2.setLanguage("Bigdata");
		technology2.setExpertise("Expert");

		Set<Technology> technologies= new HashSet<Technology>();
		technologies.add(technology1);
		technologies.add(technology2);

		developer1.setTechnology(technologies);
		developer2.setTechnology(technologies);
		developer3.setTechnology(technologies);
		session.save(developer1);
		session.save(developer2);
		session.save(developer3);
		tx.commit();
		session.close();
}
}