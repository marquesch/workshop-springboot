package com.marquesch.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marquesch.course.entities.User;
import com.marquesch.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepositoy;
	
	public List<User> findAll() {
		return userRepositoy.findAll();
	}
	
	public User findById(Long id) {
		return userRepositoy.findById(id).get();
	}
	
}
