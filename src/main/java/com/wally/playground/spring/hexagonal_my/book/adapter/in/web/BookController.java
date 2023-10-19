package com.wally.playground.spring.hexagonal_my.book.adapter.in.web;

import com.wally.playground.spring.hexagonal_company.common.WebAdapter;
import com.wally.playground.spring.hexagonal_my.book.adapter.in.web.model.BookCreateRequest;
import com.wally.playground.spring.hexagonal_my.book.application.port.in.BookUseCase;
import com.wally.playground.spring.hexagonal_my.book.application.port.in.command.CreateCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookUseCase bookUseCase;

    @PostMapping("/books")
    public void postBook(@RequestBody BookCreateRequest create) {

        CreateCommand createCommand = create.toCommand();
        bookUseCase.create(createCommand);
    }
}
