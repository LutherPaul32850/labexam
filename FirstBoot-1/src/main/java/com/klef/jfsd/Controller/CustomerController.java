package com.klef.jfsd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.klef.jfsd.Models.Customer;
import com.klef.jfsd.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService cservice;
	
	@PostMapping("/add")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer custo) {
        Customer createdCustomer = cservice.createCustomer(custo);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }
	
	 @GetMapping
	 public ResponseEntity<List<Customer>> getAllCustomers() {
	        List<Customer> listc = cservice.getAllCustomers();
	        return new ResponseEntity<>(listc, HttpStatus.OK);
	    }
}
