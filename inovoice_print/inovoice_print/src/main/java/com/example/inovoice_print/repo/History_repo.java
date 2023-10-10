package com.example.inovoice_print.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inovoice_print.entity.*;

public interface History_repo extends JpaRepository<History, Long>{
	List<History> findByOrderId(Long orderId);
}
