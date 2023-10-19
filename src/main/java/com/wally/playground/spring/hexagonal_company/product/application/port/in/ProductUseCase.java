package com.wally.playground.spring.hexagonal_company.product.application.port.in;

import com.wally.playground.spring.hexagonal_company.common.SelfValidating;
import com.wally.playground.spring.hexagonal_company.product.domain.entity.Product;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;


public interface ProductUseCase {
    void create(CreateCommand createCommand);

    @Builder
    class CreateCommand extends SelfValidating<CreateCommand> {
        @NotNull
        @Size(min = 1, max = 100)
        private String name;

        @Size(max = 100)
        private String description;

        @NotNull
        @Min(10)
        private int price;

        @NotNull
        private String category;

        public Product toEntity() {
            return Product.builder()
                    .name(name)
                    .description(description)
                    .price(price)
                    .category(category)
                    .build();
        }
    }
}
