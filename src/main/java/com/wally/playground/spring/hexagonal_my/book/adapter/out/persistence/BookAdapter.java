package com.wally.playground.spring.hexagonal_my.book.adapter.out.persistence;

import com.wally.playground.spring.hexagonal_company.common.PersistenceAdapter;
import com.wally.playground.spring.hexagonal_my.book.adapter.out.persistence.database.BookRepository;
import com.wally.playground.spring.hexagonal_my.book.application.port.out.BookQueryPort;
import com.wally.playground.spring.hexagonal_my.book.domain.entity.Book;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class BookAdapter implements BookQueryPort {

    private final BookRepository bookRepository;

    @Override
    public void insert(Book book) {
        bookRepository.save(book);
    }
}
