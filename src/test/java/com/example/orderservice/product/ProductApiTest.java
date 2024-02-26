package com.example.orderservice.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductApiTest {

    @Test
    void 상품등록() {
        final AddProductRequest request = 상품등록_요청();
        
    }

    private static AddProductRequest 상품등록_요청() {
        final String name = "상품명";
        final int price = 1000;
        final DisCountPolicy disCountPolicy = DisCountPolicy.NONE;
        final AddProductRequest request = new AddProductRequest(name, price, disCountPolicy.NONE);
        return request;
    }

}
