package com.wally.playground.spring.hexagonal_company.product.adapter.out.persistence;

import com.wally.playground.spring.hexagonal_company.common.PersistenceAdapter;
import com.wally.playground.spring.hexagonal_company.product.adapter.out.persistence.database.ProductRepository;
import com.wally.playground.spring.hexagonal_company.product.application.port.out.ProductQueryPort;
import com.wally.playground.spring.hexagonal_company.product.domain.entity.Product;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class ProductAdapter implements ProductQueryPort {

    private final ProductRepository productRepository;

    @Override
    public void insert(Product product) {
        productRepository.save(product);
    }
}
