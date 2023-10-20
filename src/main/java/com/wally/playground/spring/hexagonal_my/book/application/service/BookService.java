package com.wally.playground.spring.hexagonal_my.book.application.service;

import com.wally.playground.spring.hexagonal_company.common.UseCase;
import com.wally.playground.spring.hexagonal_my.book.application.port.in.BookUseCase;
import com.wally.playground.spring.hexagonal_my.book.application.port.in.command.BookCreateCommand;
import com.wally.playground.spring.hexagonal_my.book.application.port.out.BookQueryPort;
import com.wally.playground.spring.hexagonal_my.book.domain.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@UseCase
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BookService implements BookUseCase {

    private final BookQueryPort bookQueryPort;

    @Override
    @Transactional
    public void createBook(BookCreateCommand bookCreateCommand) {

        Book book = bookCreateCommand.toEntity();
        bookQueryPort.insert(book);
    }
}
