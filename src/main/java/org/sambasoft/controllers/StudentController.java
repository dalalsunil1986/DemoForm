package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Student;
import org.sambasoft.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	@GetMapping("/list")
	public String showStudents(Model model) {
		model.addAttribute("students", studentService.findAllStudents());
		return "students";
	}
	
	@GetMapping("/")
	public String showRegForm(Model model) {
		model.addAttribute("student", new Student());
		return "regForm";
	}
	
	@PostMapping("/register")
	public String  registerStudent(Model model,Student student) {
		studentService.createStudent(student); 
		return "redirect:/list";
	}
	
	
}
