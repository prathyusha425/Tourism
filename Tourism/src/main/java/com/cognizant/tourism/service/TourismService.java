package com.cognizant.tourism.service;

import java.util.List;

import com.cognizant.tourism.entity.Tourism;


public interface TourismService {

	public List<Tourism> getAllTours();

	public void saveTour(Tourism tour);

	public Tourism getTour(int theId);

	public void deleteTour(int theId);
	
}
