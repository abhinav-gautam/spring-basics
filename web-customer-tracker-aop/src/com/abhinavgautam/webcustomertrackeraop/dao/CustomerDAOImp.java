package com.abhinavgautam.webcustomertrackeraop.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abhinavgautam.webcustomertrackeraop.entity.Customer;

@Repository
public class CustomerDAOImp implements CustomerDAO {

	// Injecting the sessionFactory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Customer getCustomer(int customerId) {
		// Get the current hibernate session
		Session session = sessionFactory.getCurrentSession();

		// Get customer based on the customerId
		Customer customer = session.get(Customer.class, customerId);

		return customer;
	}

	@Override
	@Transactional
	public List<Customer> searchCustomers(String searchName) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Customer> theQuery = null;

		
		// only search by name if theSearchName is not empty
		if (searchName != null && searchName.trim().length() > 0) {

			// search for firstName or lastName ... case insensitive
			theQuery = currentSession.createQuery(
					"from Customer where lower(firstName) like :name or lower(lastName) like :name",
					Customer.class);
			theQuery.setParameter("name", "%" + searchName.toLowerCase() + "%");

		} else {
			// theSearchName is empty ... so just get all customers
			theQuery = currentSession.createQuery("from Customer", Customer.class);
		}

		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();

		// return the results
		return customers;

	}

	@Override
	@Transactional
	public void deleteCustomer(int customerId) {
		// Get the current hibernate session
		Session session = sessionFactory.getCurrentSession();

		// Query to delete customer by primary key
		Query<?> query = session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", customerId);

		// Execute Query
		query.executeUpdate();

	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		// Get the current hibernate session
		Session session = sessionFactory.getCurrentSession();

		// Save or update the customer to db
		session.saveOrUpdate(customer);

	}

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// Get current hibernate session
		Session session = sessionFactory.getCurrentSession();

		// Create query
		Query<Customer> query = session.createQuery("from Customer", Customer.class);

		// Execute query and get result list
		List<Customer> customers = query.getResultList();

		// Return the results
		return customers;
	}

}
