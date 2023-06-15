package com.jsp.controller;

import com.jsp.service.StudentService;

public class DeleteStudentById {
	
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		boolean flag=studentService.deleteStudentById(4
				);
		if(flag=true) {
			System.out.println("Student Details deleted ");
		}
		else {
			System.out.println("Student details not deleted");
		}
	}

}
