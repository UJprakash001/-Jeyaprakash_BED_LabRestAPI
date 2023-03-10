package com.greatlearning.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.greatlearning.sms.service.StudentService;



@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("Students", studentService.getAllStudents());
		return "students";
		
	}

}
