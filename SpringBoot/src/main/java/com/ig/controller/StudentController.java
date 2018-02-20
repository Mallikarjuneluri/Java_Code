package com.ig.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ig.Entity.Student;
import com.ig.Service.StudentService;



@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService std;
	
 @RequestMapping(method=RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return std.getAllStudents();
	}
	
}
