package com.feedback.demo.service;

import java.util.List;

import com.feedback.demo.model.Customer;

public interface CustomerService 
{
	List<Customer> getAllCustomers();
	void saveCustomer(Customer customer);
}
