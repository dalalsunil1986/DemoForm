package org.sambasoft.services;

import java.util.List;

import org.sambasoft.entities.Student;
import org.sambasoft.repositories.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentRespository studentRespository;
	
	
	/**
	 * @param student
	 */
	public void createStudent(Student student) {
		
		studentRespository.save(student);
		
	}
	
	public List<Student> listStudents(){
		return studentRespository.findAll();
	}

	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return studentRespository.findAll();
	}

}
