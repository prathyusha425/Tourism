package com.cognizant.tourism.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.tourism.entity.Tourism;

@Repository
public class TourismDaoImpl implements TourismDAO {

	@Autowired
	private SessionFactory factory;
	
	@Override
	@Transactional
	public List<Tourism> getAllTours() 
	{
		Session session=factory.getCurrentSession();
		Query<Tourism> query=session.createQuery("from Tourism", Tourism.class);
		List<Tourism> listOfTours=query.getResultList();
		System.out.println("*************************");
		listOfTours.forEach(t -> System.out.println(t));
		System.out.println("**************************");
		return listOfTours;
	}

	@Override
	public void saveTour(Tourism tour) 
	{
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(tour);
	}

	@Override
	public Tourism getTour(int theId) 
	{
		Session session=factory.getCurrentSession();
		Tourism tour=session.get(Tourism.class, theId);
		return tour;
	}

	@Override
	public void deleteTour(int theId) 
	{
		Session session=factory.getCurrentSession();
		Tourism tour=session.get(Tourism.class, theId);
		System.out.println("Deleted Tour:"+tour);
		session.delete(tour);
	}
}
