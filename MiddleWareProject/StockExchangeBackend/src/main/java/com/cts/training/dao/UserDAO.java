
package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.User;

public interface UserDAO {

//	public boolean saveUser(User user);
//
//	public boolean updateUser(User user);
	public boolean saveOrUpdateUser(User user);

	public boolean deleteUser(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();

	boolean isValidUser(String username, String Password);
	
	
}
