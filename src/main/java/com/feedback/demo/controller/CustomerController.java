package com.feedback.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.feedback.demo.model.Customer;
import com.feedback.demo.service.CustomerService;

@Controller
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	//display list of feedbacks
	@GetMapping("/")
	public String viewHomePage(Model model)
	{
		model.addAttribute("listCustomers", customerService.getAllCustomers());
		return "index";
	}
	
	@GetMapping("/feedbackForm")
	public String feedbackForm(Model model)
	{
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "new_feedback";
	}
	
	@PostMapping("saveFeedback")
	public String saveFeedback(@ModelAttribute("customer") Customer customer)
	{
		customerService.saveCustomer(customer);
		return "redirect:/";
	}
}
