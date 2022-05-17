package com.jobiak.imd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ai.jobiak.imd.model.Customer;
import ai.jobiak.imd.repository.CustomerRepo;



@Controller
public class CustomerController {
	
 @Autowired
 CustomerRepo repo;
	
 public CustomerController() {
  // TODO Auto-generated constructor stub
 }

 public CustomerController(CustomerRepo repo) {
  super();
  this.repo = repo;
 }
	
 @RequestMapping(path="/test2",method=RequestMethod.GET)
 public String redirect() {
  
  return "customerform";
 }
	
 @RequestMapping(path="/customerform",method=RequestMethod.POST)
 public String doBank(@ModelAttribute("customer")Customer customer) {
  repo.save(customer);
  return "customerview";
 }
	

}