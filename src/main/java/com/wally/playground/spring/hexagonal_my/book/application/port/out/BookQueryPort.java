package com.wally.playground.spring.hexagonal_my.book.application.port.out;

import com.wally.playground.spring.hexagonal_my.book.domain.entity.Book;

public interface BookQueryPort {
    void insert(Book book);
}
