package com.lotr.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lotr.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Learn AWS","TCS"));
		repository.insert(new Course(2,"Learn Azure","Wipro"));
		repository.insert(new Course(3,"Learn DevOps","Capgemini"));
		repository.deleteById(2);
		System.out.println(repository.findById(1));

	}

}
