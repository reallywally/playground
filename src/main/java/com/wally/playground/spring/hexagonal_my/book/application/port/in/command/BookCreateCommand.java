package com.wally.playground.spring.hexagonal_my.book.application.port.in.command;

import com.wally.playground.spring.hexagonal_company.common.SelfValidating;
import com.wally.playground.spring.hexagonal_my.book.domain.entity.Book;
import com.wally.playground.spring.hexagonal_my.book.domain.model.BookCategory;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public class BookCreateCommand extends SelfValidating<BookCreateCommand> {
    @NotNull
    @Size(min = 1, max = 100)
    private String name;

    @Size(max = 100)
    private String description;

    @NotNull
    @Min(10)
    private int price;

    @NotNull
    private String isbn;

    @NotNull
    private BookCategory category;

    public Book toEntity() {
        return Book.builder()
                .name(name)
                .description(description)
                .price(price)
                .isbn(isbn)
                .category(category)
                .build();
    }
}
