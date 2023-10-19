package com.wally.playground.spring.hexagonal_my.book.adapter.in.web.model;

import com.wally.playground.spring.hexagonal_my.book.application.port.in.command.CreateCommand;
import com.wally.playground.spring.hexagonal_my.book.domain.model.BookCategory;
import lombok.Data;

@Data
public class BookCreateRequest {
    private String name;
    private String description;
    private int price;
    private String isbn;
    private BookCategory category;

    public CreateCommand toCommand() {
        return CreateCommand.builder()
                .name(name)
                .description(description)
                .price(price)
                .isbn(isbn)
                .category(category)
                .build();
    }

}
