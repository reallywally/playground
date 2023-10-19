package com.wally.playground.spring.hexagonal_company.product.application.port.out;

import com.wally.playground.spring.hexagonal_company.product.domain.entity.Product;

public interface ProductQueryPort {
    void insert(Product product);
}
