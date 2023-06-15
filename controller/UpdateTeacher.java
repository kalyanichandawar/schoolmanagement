
package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class UpdateTeacher {

	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		Teacher t=teacherService.updateTeacher(1, "amruta", "Computer Science");
		System.out.println(t.getName());
		System.out.println(t.getDept_name());
	}
}
