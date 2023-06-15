package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	
	StudentDao studentDao=new StudentDao();
	
	//save
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	//get by id
	
	public Student getStudentById(int id) {
		if(id>0) {
			return studentDao.getStudentById(id);
		}
		else {
			return null;
		}
	}
	
	//update
	
	public Student updateStudent(int id, String name,String email,long con_no) {
		Student student=studentDao.getStudentById(id);
		student.setName(name);
		student.setEmail(email);
		student.setC_no(con_no);
		return studentDao.updateStudent(id, student, email, con_no);
	}
	
	//getAll
	
	public List<Student> getAllStudent(){
		return studentDao.getAllStudents();
	}
	
	//delete 
	
	public boolean deleteStudentById(int id) {
		if(id>0) {
			return studentDao.deleteStudentById(id);
		}
		else {
			return false;
		}
	}

}



