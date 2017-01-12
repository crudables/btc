package com.ables.btc.service;

import java.util.List;

import com.ables.btc.model.UserProfile;

public interface UserProfileService {

	List<UserProfile> findAll();
    
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}
