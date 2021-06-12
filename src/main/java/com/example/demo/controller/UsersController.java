package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.UsersService;
import com.example.demo.bean.RespenceAut;
import com.example.demo.model.Users;
import com.example.demo.repository.UsersRespository;

import Exception.ResourceNotFoundException;


@RestController
public class UsersController {
	@Autowired
	 UsersRespository usersRespository;

	@Autowired 
	UsersService usersService;
	
	// Get All Users
	@GetMapping("/user")
	public List<Users> getAllUsers(){
		return (List<Users>) this.usersRespository.findAll();
	}
	
	//Get User By ID
	@GetMapping("/user/{userid}")
	public Users getUserById(@PathVariable("userid") int id) {
		return this.usersRespository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("user not found with id : " + id));
	}
	
	//Create User
	@PostMapping("/users")
	public RespenceAut createUser(@RequestBody Users users) {
		return usersService.saveOrUpdate(users);
	}
	
	//Update User
	@PutMapping("/users/{userid}")
	public Users updateUser(@RequestBody Users users, @PathVariable("userid") int id) {
		Users exestingUser = usersRespository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("user not found with id : " + id));
		return usersRespository.save(exestingUser);
	}

	//Delete User
	@DeleteMapping("/user/{userid}")
	public ResponseEntity<Users> deleteUser(@PathVariable("userid") int userid){
		Users exestingUser =usersRespository.findById(userid)
				.orElseThrow(() -> new ResourceNotFoundException("user not found with id : " + userid));
		 usersRespository.delete(exestingUser);
		 return ResponseEntity.ok().build();
	}

	
	@PostMapping("/Aut")
	private RespenceAut login (@RequestBody Users user )
	{
		return usersService.Auth(user); 
	}
	
}
