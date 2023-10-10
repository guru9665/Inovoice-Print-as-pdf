package com.example.inovoice_print.entity;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer orderId;
    private Long customerId;
    private List<Long> productIds; // List of product IDs
    private List<Integer> quantities; // List of quantities
    private List<Double> pricesPerProduct; // List of prices per product
    private List<String> productName; // List of prices per product
    private Integer grossTotal;

    

    public Long getId() {
        return id;
    }

    /**
	 * @param id
	 * @param orderId
	 * @param customerId
	 * @param productIds
	 * @param quantities
	 * @param pricesPerProduct
	 * @param grossTotal
	 */
	
	

	/**
	 * 
	 */
	public History() {
		super();
	}

	public History(Long id, Integer orderId, Long customerId, List<Long> productIds, List<Integer> quantities,
			List<Double> pricesPerProduct, List<String> productName, Integer grossTotal) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.customerId = customerId;
		this.productIds = productIds;
		this.quantities = quantities;
		this.pricesPerProduct = pricesPerProduct;
		this.productName = productName;
		this.grossTotal = grossTotal;
	}

	public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }

    public List<Double> getPricesPerProduct() {
        return pricesPerProduct;
    }

    public void setPricesPerProduct(List<Double> pricesPerProduct) {
        this.pricesPerProduct = pricesPerProduct;
    }

	public Integer getGrossTotal() {
		return grossTotal;
	}

	public void setGrossTotal(Integer grossTotal) {
		this.grossTotal = grossTotal;
	}

	public List<String> getProductName() {
		return productName;
	}

	public void setProductName(List<String> productName) {
		this.productName = productName;
	}

	
}
