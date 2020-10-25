package com.abhinavgautam.customertrackerrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abhinavgautam.customertrackerrest.dao.CustomerDAO;
import com.abhinavgautam.customertrackerrest.entity.Customer;
import com.abhinavgautam.customertrackerrest.exception.CustomerNotFoundException;

@RestController
@RequestMapping("/api")
public class CustomerController {

	// Injecting the customerDAO
	@Autowired
	private CustomerDAO customerDAO;

	@GetMapping("/customers")
	public List<Customer> listCustomers() {
		return customerDAO.getCustomers();
	}

	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		Customer customer = customerDAO.getCustomer(customerId);
		if (customer == null) {
			throw new CustomerNotFoundException("Customer not found with id - " + customerId);
		}
		return customer;
	}

	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		// Setting id to 0 to force save the customer instead of updating
		customer.setId(0);
		customerDAO.saveCustomer(customer);
		return customer;
	}

	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		customerDAO.saveCustomer(customer);
		return customer;
	}

	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		Customer customer = customerDAO.getCustomer(customerId);
		if (customer == null) {
			throw new CustomerNotFoundException("Customer not found with id - " + customerId);
		}
		customerDAO.deleteCustomer(customerId);
		return "Deleted Customer Id - " + customerId;
	}
}
