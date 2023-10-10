package com.example.inovoice_print.Controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inovoice_print.Service.Customer_Service;
import com.example.inovoice_print.entity.Customer;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private Customer_Service custo;
	
	@PostMapping(path = "/save")
	public  void saveCustomer(@RequestBody Customer customer) {
		custo.addCustomer(customer);
	}
	
	@PutMapping(path = "/update")
	public void updateCustomer(@RequestBody Customer customer) {
		custo.addCustomer(customer);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deletCustomer(@PathVariable long id) {
		custo.deleteCustomer(id);
	}
	
	@GetMapping
	public List<Customer> findAllCustomer(){
		return custo.findAllCustomer();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Customer> searchCustomer(@PathVariable long id){
		return custo.searchCustomer(id);
	}
}
