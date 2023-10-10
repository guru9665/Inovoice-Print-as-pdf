package com.example.inovoice_print.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inovoice_print.entity.Product;
import com.example.inovoice_print.repo.Product_repo;

@Service
public class Product_impl implements Product_Service {

	@Autowired
	private Product_repo prod;

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return prod.findAll();
	}

	@Override
	public void addProduct(Product p) {
		Product product = new Product(p.getProductid(), p.getProductname(), p.getPrice());
		prod.save(product);
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		Product product = new Product(p.getProductid(), p.getProductname(), p.getPrice());
		prod.save(product);
	}

	@Override
	public void deleteCustome(Long id) {
		// TODO Auto-generated method stub
		prod.deleteById(id);

	}

	@Override
	public Optional<Product> searchProduct(Long id) {
		// TODO Auto-generated method stub
		return prod.findById(id);
	}

}
