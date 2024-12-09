package com.klef.jfsd.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.Models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
