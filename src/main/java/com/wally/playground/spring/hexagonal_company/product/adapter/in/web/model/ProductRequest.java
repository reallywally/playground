package com.wally.playground.spring.hexagonal_company.product.adapter.in.web.model;

import com.wally.playground.spring.hexagonal_company.product.application.port.in.ProductUseCase;
import lombok.Data;

public class ProductRequest {

    @Data
    public static class Create {
        private String name;
        private String description;
        private int price;
        private String category;

        public ProductUseCase.CreateCommand toCommand() {
            return ProductUseCase.CreateCommand.builder()
                    .name(name)
                    .description(description)
                    .price(price)
                    .category(category)
                    .build();
        }
    }
}
