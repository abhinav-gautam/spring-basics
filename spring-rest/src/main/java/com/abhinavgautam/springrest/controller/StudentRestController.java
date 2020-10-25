package com.abhinavgautam.springrest.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhinavgautam.springrest.entity.Student;
import com.abhinavgautam.springrest.exception.StudentNotFoundException;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;

	@PostConstruct
	public void loadData() {
		students = new ArrayList<Student>();
		students.add(new Student("John", "Wick"));
		students.add(new Student("John", "Doe"));
		students.add(new Student("Jane", "Wick"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}

	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		if (studentId > students.size() || studentId < 0) {
			throw new StudentNotFoundException("Student not found - " + studentId);
		}
		return students.get(studentId);
	}

	
}
