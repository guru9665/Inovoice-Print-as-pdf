package com.example.inovoice_print.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inovoice_print.entity.*;

public interface customer_repo extends JpaRepository<Customer, Long> {

}
