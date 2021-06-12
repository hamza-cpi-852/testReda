package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Users;

public interface UsersRespository extends CrudRepository<Users, Integer> {
	
  Users  findByusername (String username);
}
