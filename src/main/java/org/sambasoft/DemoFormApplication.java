package org.sambasoft;

import org.sambasoft.entities.Student;
import org.sambasoft.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class DemoFormApplication implements CommandLineRunner {
	
	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(DemoFormApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			Student s = new Student();
			if(i%2==0) {
			s.setEmail(i+"@"+i+".com");
			}else {
			s.setEmail(i+"@"+i+".naija");
			}
			s.setName("name"+i);
			
			studentService.createStudent(s); 
		}
	}

}
