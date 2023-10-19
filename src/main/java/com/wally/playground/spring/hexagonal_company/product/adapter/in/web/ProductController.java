package com.wally.playground.spring.hexagonal_company.product.adapter.in.web;

import com.wally.playground.spring.hexagonal_company.common.WebAdapter;
import com.wally.playground.spring.hexagonal_company.product.adapter.in.web.model.ProductRequest;
import com.wally.playground.spring.hexagonal_company.product.application.port.in.ProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@WebAdapter
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductUseCase productUseCase;

    @PostMapping("/products")
    public void postProduct(@RequestBody ProductRequest.Create create) {

        ProductUseCase.CreateCommand createCommand = create.toCommand();
        productUseCase.create(createCommand);

    }
}
