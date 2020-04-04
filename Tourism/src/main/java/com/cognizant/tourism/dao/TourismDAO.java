package com.cognizant.tourism.dao;

import java.util.List;

import com.cognizant.tourism.entity.Tourism;

public interface TourismDAO 
{

	List<Tourism> getAllTours();

	void saveTour(Tourism tour);

	Tourism getTour(int theId);

	void deleteTour(int theId);
	
}
