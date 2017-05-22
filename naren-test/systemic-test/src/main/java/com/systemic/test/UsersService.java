package com.systemic.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List<Users> getAllUsers(){
		
		List <Users> users = new ArrayList<>();
		usersRepository.findAll()
		.forEach(users::add);
		return users;		
	}
	
	public Users getUser(String id){
		
		return usersRepository.findOne(id);
	}
	
	public void addUser(Users users){
		
		usersRepository.save(users);
	}
	
	public void updateUser(String id, Users users){
		
		usersRepository.save(users);
	}
	
	public void deleteUser(String id){
		
		usersRepository.delete(id);
		
	}
	
}
