package com.systemic.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UsersService usersService;
	
	
	@RequestMapping("/user")
	public String getUser(){
		return "Systemic";
	}
	
	@RequestMapping("/users")
	public List<Users> getAllUsers(){
		
		return usersService.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public Users getUser(@PathVariable  String id){
		
		return usersService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody  Users users){
		
		usersService.addUser(users);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@RequestBody Users users, @PathVariable  String id){
		
		usersService.updateUser(id, users);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteUser(@PathVariable  String id){
		
		usersService.deleteUser(id);
	}
	

}
