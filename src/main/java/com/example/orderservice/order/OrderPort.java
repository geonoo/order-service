package com.example.orderservice.order;

import com.example.orderservice.product.Product;

public interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);
}
