package com.rohan.rest.webservices.RestfulWebServices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohan.rest.webservices.RestfulWebServices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
