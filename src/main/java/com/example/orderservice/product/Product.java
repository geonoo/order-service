package com.example.orderservice.product;



import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "products")
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private DisCountPolicy disCountPolicy;


    public Product(String name, int price, DisCountPolicy disCountPolicy) {
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "가격은 0 보다 커야합니다.");
        Assert.notNull(disCountPolicy, "할인 정책은 필수 입니다.");
        this.name = name;
        this.price = price;
        this.disCountPolicy = disCountPolicy;
    }
}
