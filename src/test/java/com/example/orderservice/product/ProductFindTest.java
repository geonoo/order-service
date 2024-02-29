package com.example.orderservice.product;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ProductFindTest {

    @Autowired
    private ProductService productService;

    // Api Test로 인해 필요 없음
//    @Test
//    public void 상품조회(){
//        productService.addProduct(ProductSteps.상품등록_요청());
//        final Long productId = 1L;
//
//        final GetProductResponse response = productService.getProduct(productId);
//
//        assertThat(response).isNotNull();
//
//    }


}
