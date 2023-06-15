package com.jsp.controller;
import com.jsp.dto.Student;
import com.jsp.service.StudentService;


public class SaveController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

StudentService studentService=new StudentService();
		
		Student student=new Student();
		student.setName("renu");
		student.setEmail("renu@gmail.com");
		student.setC_no(1299988546);
		
		Student s=studentService.saveStudent(student);
		if(s!=null) {
			System.out.println("Student save");
		}
	}

}
