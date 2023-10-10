package com.example.inovoice_print.Service;

import java.util.List;
import java.util.Optional;

import com.example.inovoice_print.entity.Product;

public interface Product_Service {
	List<Product> findAllProduct();
	void addProduct(Product p);
	void updateProduct(Product p);
	void deleteCustome(Long id);
	Optional<Product> searchProduct(Long id);
}
