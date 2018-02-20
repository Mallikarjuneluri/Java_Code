package com.ig.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ig.Entity.Student;

@Repository
public class SubDao {

	private static Map<Integer,Student> students;
	
	static{
		students =new HashMap<Integer,Student>(){
			{
			put(1,new Student(1,"Arjun", "CSE"));
			put(1,new Student(1,"Arjun", "CSE"));
			put(1,new Student(1,"Arjun", "CSE"));
		}
		};
				
	}
	
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
}
