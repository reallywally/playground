package com.wally.playground.spring.hexagonal_company.product.adapter.in.web;

import com.wally.playground.spring.hexagonal_company.product.adapter.in.web.model.ProductRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductControllerTest {

    @Autowired
    private ProductController productController;

    @Test
    void postProduct() {

        ProductRequest.Create create = new ProductRequest.Create();
        create.setName("맥북");
        create.setDescription("맥북 프로 16인치 풀옵션");
        create.setPrice(1000000);
        create.setCategory("전자제품");

        productController.postProduct(create);
    }
}