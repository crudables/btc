package com.ables.btc.test;

import org.junit.Test;

import com.ables.btc.model.User;
import com.ables.btc.repo.UserRepo;
import com.mmnaseri.utils.spring.data.dsl.factory.RepositoryFactoryBuilder;

public class RepoTest {
	
	@Test
	public void testCreate(){
		UserRepo userRepo = RepositoryFactoryBuilder.builder().mock(UserRepo.class);
		
		User user = new User();
		user.setAddress("Ago palace");
		user.setEmail("crudables@yahoo.com");
		user.setFirstName("Saheed");
		user.setLastName("Awolaju");
		user.setPassword("cmaganag");
		user.setPhone("09887765");
		user.setUsername("ables");
		 userRepo.save(user);
	}
}
