package com.lotr.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lotr.springboot.learn_jpa_and_hibernate.course.Course;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Learn Python","Snape"));
		repository.insert(new Course(2,"Learn Java","Navin"));
		repository.insert(new Course(3,"Learn Spring","Bharath"));
		repository.deleteById(2);
		System.out.println(repository.findById(1));
	}

}
