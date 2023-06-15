package com.jsp.controller;

import com.jsp.service.TeacherService;

public class DeleteTeacherById {

	
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		boolean flag=teacherService.deleteTeacherById(2);
		if(flag=true) {
			System.out.println("Teacher Details deleted ");
		}
		else {
			System.out.println("Teacher details not deleted");
		}
	}
}
