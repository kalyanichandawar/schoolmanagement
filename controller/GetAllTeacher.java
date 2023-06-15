package com.jsp.controller;

import java.util.List;


import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class GetAllTeacher {
	
public static void main(String[] args) {
		
		TeacherService teacherService=new TeacherService();
		List<Teacher> teacher=teacherService.getAllTeachers();
		for(Teacher t:teacher) {
			System.out.println(t.getId());
			System.out.println(t.getName());
			System.out.println(t.getDept_name());
			System.out.println("=================");
			
		}
	}

}
