package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class SaveTeacherController {
	
	public static void main(String[] args) {
		
		TeacherService teacherService=new TeacherService();
		
		Teacher teacher=new Teacher();
		teacher.setName("renu");
		teacher.setDept_name("english");
        
		Teacher t=teacherService.saveTeacher(teacher);
		if(t!=null) {
			System.out.println("Teacher Details Save");
		}
	}

}

