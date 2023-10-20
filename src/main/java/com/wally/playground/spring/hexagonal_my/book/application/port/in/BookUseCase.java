package com.wally.playground.spring.hexagonal_my.book.application.port.in;

import com.wally.playground.spring.hexagonal_my.book.application.port.in.command.BookCreateCommand;

public interface BookUseCase {
    void createBook(BookCreateCommand createCommand);

}
