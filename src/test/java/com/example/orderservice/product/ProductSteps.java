package com.example.orderservice.product;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.springframework.http.MediaType;

public class ProductSteps {
    public static ExtractableResponse<Response> 상품요청(AddProductRequest request) {
        return RestAssured.given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(request)
                .when()
                .post("/products")
                .then()
                .log().all().extract();
    }

    public static AddProductRequest 상품등록_요청() {
        final String name = "상품명";
        final int price = 1000;
        final DisCountPolicy disCountPolicy = DisCountPolicy.NONE;
        final AddProductRequest request = new AddProductRequest(name, price, disCountPolicy.NONE);
        return request;
    }
}
