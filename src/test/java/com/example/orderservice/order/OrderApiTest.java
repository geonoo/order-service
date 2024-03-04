package com.example.orderservice.order;

import com.example.orderservice.ApiTest;
import com.example.orderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OrderApiTest extends ApiTest {

    @Test
    void 상품주문() {
        ProductSteps.상품요청(ProductSteps.상품등록_요청());
        final var request = OrderSteps.상품주문요청_생성();

        final var response = OrderSteps.상품주문요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

}

