package com.klu.services.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import com.klu.services.OrderRequest;

import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public Map<String, Object> createOrder(
            @Valid @RequestBody OrderRequest order) {

        return Map.of(
            "message", "Order created successfully",
            "customerName", order.getCustomerName(),
            "productName", order.getProductName(),
            "quantity", order.getQuantity(),
            "price", order.getPrice()
        );
    }
}