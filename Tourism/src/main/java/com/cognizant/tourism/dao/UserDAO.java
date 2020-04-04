package com.cognizant.tourism.dao;

import com.cognizant.tourism.entity.Login;

public interface UserDAO {


	boolean validateUser(String username, String password);

	void saveUser(Login login);

}
