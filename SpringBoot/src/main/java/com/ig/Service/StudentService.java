package com.ig.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ig.Dao.SubDao;
import com.ig.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private SubDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
}
