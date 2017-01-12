package com.ables.btc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ables.btc.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
