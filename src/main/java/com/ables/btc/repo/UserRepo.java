package com.ables.btc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ables.btc.model.User;

@Repository 
public interface UserRepo extends JpaRepository<User, Integer> {
	@Query("SELECT  DISTINCT u FROM User u where u.username = :username")
	User findByUsername(@Param("username")String username);
	
	@Query("DELETE  FROM User u where u.username = :username")
    int deleteByUsername(@Param("username")String username);

}
