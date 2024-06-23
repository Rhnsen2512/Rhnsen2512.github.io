package com.lotr.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lotr.springboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	//@Autowired
	@PersistenceContext//(does the same thing as @Autowired but is more specific annotation to EntityMgr)
	private EntityManager entityManager;
 
 public void insert(Course course) {
	 //to insert a row,EntityMgr provides a method merge(
	 entityManager.merge(course);
 }
 
 public Course findById(long id) {
	return entityManager.find(Course.class, id);
 }
 
 public void deleteById(long id) {
	 Course course=entityManager.find(Course.class, id);
	 entityManager.remove(course);
	 
 }
}
