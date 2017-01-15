package com.ables.btc.service;

import java.util.List;

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
	
	@Override
	public User findByUsername(String username){
		return new User();
//		return userRepo.findByUsername(username);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public int deleteByUsername(String username) {
		// TODO Auto-generated method stub
		return 0;
//		return userRepo.deleteByUsername(username);
		
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	

}
