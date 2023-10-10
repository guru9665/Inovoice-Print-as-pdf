package com.example.inovoice_print.Service;

import java.util.List;
import java.util.Optional;

import com.example.inovoice_print.entity.Customer;

public interface Customer_Service {
	List<Customer> findAllCustomer();
	void addCustomer(Customer c);
	void updateCustomer(Customer c);
	void deleteCustomer(Long id);
	Optional<Customer> searchCustomer(Long id);
}
