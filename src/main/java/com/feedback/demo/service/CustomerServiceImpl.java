package com.feedback.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.demo.model.Customer;
import com.feedback.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() 
	{
		return customerRepository.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) 
	{
		this.customerRepository.save(customer);
		
	}

}
