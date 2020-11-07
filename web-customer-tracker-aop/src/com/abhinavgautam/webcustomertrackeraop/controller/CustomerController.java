package com.abhinavgautam.webcustomertrackeraop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abhinavgautam.webcustomertrackeraop.dao.CustomerDAO;
import com.abhinavgautam.webcustomertrackeraop.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// Injecting the customerDAO
	@Autowired
	private CustomerDAO customerDAO;

	@GetMapping("/list")
	public String listCustomers(Model model) {
		// Get customers from the DAO
		List<Customer> customers = customerDAO.getCustomers();

		// Add it to the model
		model.addAttribute("customers", customers);

		return "list-customer";
	}

	@GetMapping("/addForm")
	public String addCustomer(Model model) {
		// Create the model attribute to bind form data
		Customer customer = new Customer();

		model.addAttribute("customer", customer);

		return "add-customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		// Call DAO to save customer to db
		customerDAO.saveCustomer(customer);
		return "redirect:/customer/list";
	}

	@GetMapping("/updateForm")
	public String updateCustomer(@RequestParam("customerId") int customerId, Model model) {
		// Get cutomer from the database
		Customer customer = customerDAO.getCustomer(customerId);

		// Add it to model attribute to prepopulate the form
		model.addAttribute("customer", customer);

		return "update-customer-form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int customerId) {
		// Delete the customer
		customerDAO.deleteCustomer(customerId);
		return "redirect:/customer/list";
	}

	@PostMapping("/search")
	public String searchCustomers(@RequestParam("searchName") String searchName, Model theModel) {

		// search customers from the service
		List<Customer> customers = customerDAO.searchCustomers(searchName);

		// add the customers to the model
		theModel.addAttribute("customers", customers);

		return "list-customer";
	}
}
