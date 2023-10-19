package com.wally.playground.spring.hexagonal_my.book.adapter.in.web;

import com.wally.playground.spring.hexagonal_my.book.adapter.in.web.model.BookCreateRequest;
import com.wally.playground.spring.hexagonal_my.book.domain.model.BookCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    void postBook() {

        BookCreateRequest create = new BookCreateRequest();
        create.setName("스프링 부트 강의");
        create.setDescription("유명 강사가 만듬");
        create.setPrice(20000);
        create.setIsbn("123-456-789");
        create.setCategory(BookCategory.COOKING);

        bookController.postBook(create);
    }

}