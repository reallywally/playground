package com.wally.playground.spring.hexagonal_my.book.application.service;

import com.wally.playground.spring.hexagonal_company.common.UseCase;
import com.wally.playground.spring.hexagonal_my.book.application.port.in.BookUseCase;
import com.wally.playground.spring.hexagonal_my.book.application.port.in.command.CreateCommand;
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
    public void create(CreateCommand createCommand) {

        Book book = createCommand.toEntity();
        bookQueryPort.insert(book);
    }
}
