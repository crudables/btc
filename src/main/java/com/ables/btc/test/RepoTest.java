package com.ables.btc.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.transaction.TransactionConfiguration;

import org.springframework.transaction.annotation.Transactional;

import com.ables.btc.model.User;
import com.ables.btc.repo.UserRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class RepoTest {
	@Autowired
	private UserRepo userRepo;
	
	@Test
	public void testCreateUser(){
		User user = new User();
		user.setFirstName("Saheed");
		user.setLastName("Awolaju");
		user.setEmail("crudables@yahoo.com");
		user.setPhone("08102938455");
		user.setAddress("Ago Palace way");
		user.setUsername("Ables");
		
		assertNull(user.getId());
		userRepo.save(user);
		
		assertNotNull(user.getId());
		assertTrue(user.getId() > 0);
//		
				
	}
}
