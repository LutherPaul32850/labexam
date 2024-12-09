package com.klef.jfsd.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.Models.Customer;
import com.klef.jfsd.Repo.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo crepo;
	private final Map<Long, Customer> cust = new HashMap<>();
	
	public Customer createCustomer(Customer cus) {
        crepo.save(cus);
        cust.put(cus.getId(), cus);
        return cus;
    }
	public List<Customer>getAllCustomers() {
		 List<Customer> clist = crepo.findAll();
		 System.out.println(clist);
	        return clist;
	    }
}
