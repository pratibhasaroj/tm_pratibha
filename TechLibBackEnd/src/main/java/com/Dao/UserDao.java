package com.Dao;

import java.util.List;

import com.Model.USer;

public interface UserDao {

	
		 public void insertUser(USer user);
		 public List<USer> getAllUsers();
	}
