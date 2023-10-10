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

import com.example.inovoice_print.Service.Product_Service;
import com.example.inovoice_print.entity.Product;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/product")
public class Product_Controller {
	
	@Autowired
	private Product_Service prodo;
	
	@PostMapping(path = "/save")
	public void saveProduct(@RequestBody Product product) {
		prodo.addProduct(product);
	}
	
	@PutMapping(path = "/update")
	public void updateProduct(@RequestBody Product product) {
		prodo.updateProduct(product);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteProduct(@PathVariable long id) {
		prodo.deleteCustome(id);
	}
	
	@GetMapping
	public List<Product> allProduct(){
		return prodo.findAllProduct();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Product> findProduct(@PathVariable long id){
		return prodo.searchProduct(id);
	}
}
