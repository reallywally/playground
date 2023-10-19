package com.wally.playground.spring.hexagonal_my.book.application.port.in;

import com.wally.playground.spring.hexagonal_my.book.application.port.in.command.CreateCommand;

public interface BookUseCase {
    void create(CreateCommand createCommand);

}
