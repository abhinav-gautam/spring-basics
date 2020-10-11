package com.abhinavgautam.springmvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String ShowForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String ProcessForm() {
		return "helloworld-form-process";
	}

	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		// Getting Request Parameter
		String studentName = request.getParameter("studentName");
		// Making uppercase
		studentName = studentName.toUpperCase();
		// Adding it in model as attribute
		model.addAttribute("studentName", studentName);
		return "helloworld-form-process-uppercase";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String studentName, Model model) {
		studentName = studentName.toUpperCase();
		model.addAttribute("studentName", studentName);
		return "helloworld-form-process-uppercase";
	}
}
