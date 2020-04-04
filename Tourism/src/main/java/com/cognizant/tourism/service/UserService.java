package com.cognizant.tourism.service;

import com.cognizant.tourism.entity.Login;

public interface UserService 
{

	boolean validateUser(String username, String password);

	void saveUser(Login login);	
}
