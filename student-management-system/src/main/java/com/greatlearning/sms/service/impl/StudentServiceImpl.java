package com.greatlearning.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.sms.enity.Student;
import com.greatlearning.sms.repository.StudentRepository;
import com.greatlearning.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
		
		// TODO Auto-generated constructor stub
	}
 

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	 
}
