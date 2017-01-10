package com.niit.cakenationbackend.dao;

import java.util.List;

import com.niit.cakenationbackend.model.User;

public interface UserDAO {
	public List<User> list();

	public User get(String userid);
	
	public void save(User user);
	public void update(User user);

	public void delete(String userid);
	
	public User isValidUser(String userid, String password);

}
