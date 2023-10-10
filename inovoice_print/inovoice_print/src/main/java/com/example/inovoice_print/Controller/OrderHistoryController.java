package com.example.inovoice_print.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inovoice_print.entity.History;
import com.example.inovoice_print.repo.History_repo;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Update with your frontend URL
@RequestMapping("/api/order-history")
public class OrderHistoryController {
    @Autowired
    private final History_repo orderHistoryRepository;

    public OrderHistoryController(History_repo orderHistoryRepository) {
        this.orderHistoryRepository = orderHistoryRepository;
    }

    private Integer generateUniqueOrderId() {
        // You can use a timestamp and a database-generated ID
        long timestamp = System.currentTimeMillis();
        Integer uniqueId = (int) timestamp; // Cast to integer if needed
        
        if(uniqueId < 0) {
            uniqueId = uniqueId * -1;
        }

        return uniqueId;
    }

    @PostMapping("/save")
    public ResponseEntity<History> saveOrderHistory(@RequestBody History orderHistory) {
        // Generate a unique integer order ID
        Integer uniqueOrderId = generateUniqueOrderId();
        orderHistory.setOrderId(uniqueOrderId); // Set the unique order ID
        System.out.println(orderHistory.getPricesPerProduct());
        History savedOrderHistory = orderHistoryRepository.save(orderHistory);
        return new ResponseEntity<>(savedOrderHistory, HttpStatus.CREATED);
    }

    @GetMapping("/by-order/{orderId}")
    public ResponseEntity<List<History>> getOrderHistoryByOrderId(@PathVariable Long orderId) {
        List<History> orderHistoryList = orderHistoryRepository.findByOrderId(orderId);
        return new ResponseEntity<>(orderHistoryList, HttpStatus.OK);
    }
    
    @GetMapping("/by-order")
    public List<History> allhistory() {
    	return orderHistoryRepository.findAll();
    }
}
