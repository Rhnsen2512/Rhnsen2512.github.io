package com.rohan.rest.webservices.RestfulWebServices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rohan.rest.webservices.RestfulWebServices.jpa.UserRepository;

@RestController
public class UserJpaResource {
	
	private UserRepository repository;
	
	private UserDaoService service;
	
	public UserJpaResource(UserDaoService service ,UserRepository repository) {
		this.service=service;
		this.repository=repository;
	}
	
	@GetMapping("/jpa/users")
	public List<User> retrieveAllUsers(){
        return repository.findAll();
   }
	
	@GetMapping("/jpa/users/{id}")
	public Optional<User> retrieveUsers(@PathVariable Integer id){
        Optional<User> user = repository.findById(id);
        if(user.isEmpty()) {
        	throw new UserNotFoundException("id: "+id) ;
        }
		return user;
 }
	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User savedUser= repository.save(user);
		 URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
}
