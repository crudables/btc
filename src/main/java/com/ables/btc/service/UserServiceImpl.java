package com.ables.btc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ables.btc.model.User;
import com.ables.btc.repo.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo userRepo;
	
	public User findById(int id){
		User user = userRepo.findOne(id);
		return user;
		
	}
	
	public User findByUsername(String username){
		
	}
	

}
