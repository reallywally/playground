package com.wally.playground.spring.hexagonal_company.product.application.service;

import com.wally.playground.spring.hexagonal_company.common.UseCase;
import com.wally.playground.spring.hexagonal_company.product.application.port.in.ProductUseCase;
import com.wally.playground.spring.hexagonal_company.product.application.port.out.ProductQueryPort;
import com.wally.playground.spring.hexagonal_company.product.domain.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@UseCase
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ProductService implements ProductUseCase {

    private final ProductQueryPort productQueryPort;

    @Override
    @Transactional
    public void create(CreateCommand createCommand) {

        Product product = createCommand.toEntity();
        productQueryPort.insert(product);
    }
}
