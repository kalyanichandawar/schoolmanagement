package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class UpdateStudent {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		Student s=studentService.updateStudent(4, "rutu", "rutu2@gmail.com",1234877891);
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s.getC_no());
		
	}

}
