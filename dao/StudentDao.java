package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kalyani");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	//save student
	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	//get by id
	
		public Student getStudentById(int id) {
			return entityManager.find(Student.class, id);
		}
		
		//update
		
		public Student updateStudent(int id,Student student,String email,long con_no) {
			if(student!=null) {
				entityTransaction.begin();
				entityManager.persist(student);
				entityTransaction.commit();
				return student;
			}
			else {
				return null;
			}
		}
		
		// get all student
		
		public List<Student> getAllStudents() {
			String jpql="SELECT s FROM Student s";
			Query query=entityManager.createQuery(jpql);
			List<Student> students=query.getResultList();
			return students;	
		}
		
		//delete
		
		public boolean deleteStudentById(int id) {
			Student student=entityManager.find(Student.class, id);
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return true;
			
		}

	

	

	

	
	
	

}
