package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.RespenceAut;
import com.example.demo.model.Users;
import com.example.demo.repository.UsersRespository;

@Service
public class UsersService {
	@Autowired
	UsersRespository usersRespository;
	RespenceAut resAuth = new  RespenceAut();
	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<Users>();
		usersRespository.findAll().forEach(user -> users.add(user));
		return users;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Users getUsersById(int id) {
		return usersRespository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public RespenceAut saveOrUpdate(Users users) {
	 Users user = usersRespository.findByusername(users.getUsername());
	  if (user != null ) {
		  resAuth.setMessag("email exist deja ");
	  }
	  else {
		  usersRespository.save(users);
		  resAuth.setMessag("saved" ); 
	  }
		
		return resAuth;
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		usersRespository.deleteById(id);
	}

	// updating a record
	public void update(Users users, int userid) {
		usersRespository.save(users);
	}
	
	public RespenceAut Auth (Users user) {
		 Users userAut  = usersRespository.findByusername(user.getUsername());
		 if (userAut != null && userAut.getPassword().equalsIgnoreCase(user.getPassword())){
			 resAuth.setMessag("ok");
		 }
		  else {
			  resAuth.setMessag(" false ");
   	   }
		 return resAuth;
	}
	
}
