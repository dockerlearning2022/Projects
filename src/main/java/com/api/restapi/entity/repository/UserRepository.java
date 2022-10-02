package com.api.restapi.entity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restapi.entity.User;

@Repository
public interface UserRepository extends  JpaRepository<User, Long> { 
	
	User findByName(String name);
	

}
