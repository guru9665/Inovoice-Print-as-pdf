package com.example.inovoice_print.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inovoice_print.entity.Customer;
import com.example.inovoice_print.repo.customer_repo;

@Service
public class Customer_Impl implements Customer_Service{

	@Autowired
	private customer_repo cust;
	
	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return cust.findAll();
	}

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		Customer customer=new Customer(
				c.getCustomerid(),c.getCustomername(),c.getAddress(),c.getMobile()
				);
		cust.save(customer);
	}

	@Override
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		Customer customer=new Customer(
				c.getCustomerid(),c.getCustomername(),c.getAddress(),c.getMobile()
				);
		cust.save(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		cust.deleteById(id);
	}

	@Override
	public Optional<Customer> searchCustomer(Long id) {
		// TODO Auto-generated method stub
		return cust.findById(id);
	}

}
