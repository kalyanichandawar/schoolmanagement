package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {

	TeacherDao teacherDao=new TeacherDao();
	
	//save
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
	}
	
	//get by id
	
	public Teacher getTeacherById(int id) {
		if(id>0) {
			return teacherDao.getTeacherById(id);
		}
		else {
			return null;
		}
	}
	
	//update
	public Teacher updateTeacher(int id, String name, String dept_name) {
		Teacher teacher=teacherDao.getTeacherById(id);
		teacher.setName(name);
		teacher.setDept_name(dept_name);
		return teacherDao.updateTeacher(id, teacher, dept_name);
	}
	
	//getAll
	
	public List<Teacher> getAllTeachers(){
		return teacherDao.getAllTeachers();
	}
	
	//delete 
	
		public boolean deleteTeacherById(int id) {
			if(id>0) {
				return teacherDao.deleteTeacherById(id);
			}
			else {
				return false;
			}
		}
}











