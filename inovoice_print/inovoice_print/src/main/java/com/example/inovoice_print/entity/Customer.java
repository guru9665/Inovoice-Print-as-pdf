package com.example.inovoice_print.entity;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerid;

	private String customername;

	private String address;

	private int mobile;

	/**
	 * @param customerid
	 * @param customername
	 * @param address
	 * @param mobile
	 */
	public Customer(int customerid, String customername, String address, int mobile) {
		this.customerid = customerid;
		this.customername = customername;
		this.address = address;
		this.mobile = mobile;
	}

	/**
	 * 
	 */
	public Customer() {
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	 
	
}
