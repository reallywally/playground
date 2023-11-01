package com.wally.playground.spring.simple_post.adapter.in.web.model;

import com.wally.playground.spring.hexagonal_my.book.application.port.in.command.BookCreateCommand;
import com.wally.playground.spring.hexagonal_my.book.domain.model.BookCategory;
import lombok.Data;

@Data
public class PostCreateRequest {
    private String name;
    private String description;
    private int price;
    private String isbn;
    private BookCategory category;

    public BookCreateCommand toCommand() {
        return BookCreateCommand.builder()
                .name(name)
                .description(description)
                .price(price)
                .isbn(isbn)
                .category(category)
                .build();
    }

}
