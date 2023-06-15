package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Teacher;

public class TeacherDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kalyani");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
   //save teacher
	
	public Teacher saveTeacher(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
	
	//get by id
	
	public Teacher getTeacherById(int id) {
		return entityManager.find(Teacher.class, id);
	}
	
	//update
	
	public Teacher updateTeacher(int id,Teacher teacher, String dept_name) {
		if(teacher!=null) {
			entityTransaction.begin();
			entityManager.persist(teacher);
			entityTransaction.commit();
			return teacher;
		}
		else {
			return null;
		}
	}
 
	  //get all student
	
	public List<Teacher> getAllTeachers(){
		String jpql="SELECT t FROM Teacher t";
		Query query=entityManager.createQuery(jpql);
		List<Teacher> teachers=query.getResultList();
		return teachers;
	}
	
	//delete
	
	public boolean deleteTeacherById(int id) {
		Teacher teacher=entityManager.find(Teacher.class, id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
		return true;
	}
	

}



























