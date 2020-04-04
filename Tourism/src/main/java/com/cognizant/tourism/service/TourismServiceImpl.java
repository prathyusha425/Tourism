package com.cognizant.tourism.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.tourism.dao.TourismDAO;
import com.cognizant.tourism.entity.Tourism;

@Service
public class TourismServiceImpl implements TourismService 
{
	
	@Autowired
	private TourismDAO tourism;

	@Override
	@Transactional
	public List<Tourism> getAllTours() {
		return tourism.getAllTours();
	}

	@Override
	@Transactional
	public void saveTour(Tourism tour) {
		tourism.saveTour(tour);
	}

	@Override
	@Transactional
	public Tourism getTour(int theId) {
		return tourism.getTour(theId);
	}

	@Override
	@Transactional
	public void deleteTour(int theId) 
	{
		tourism.deleteTour(theId);
	}

	
}
