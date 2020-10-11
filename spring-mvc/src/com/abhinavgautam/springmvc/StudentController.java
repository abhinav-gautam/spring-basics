package com.abhinavgautam.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// Create object of student class
		Student student = new Student();

		// Add the object to the model
		model.addAttribute("student", student);

		return "student-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("Student Info: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-form-confirm";
	}
}
