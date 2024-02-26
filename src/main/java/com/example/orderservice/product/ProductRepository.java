package com.example.orderservice.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
class ProductRepository {
    private Long seq = 0L;
    private Map<Long, Product> persistence = new HashMap<>();

    public void save(Product product) {
        product.assignId(++seq);
        persistence.put(product.getId(), product);
    }
}
