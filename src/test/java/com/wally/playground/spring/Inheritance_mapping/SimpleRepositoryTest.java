package com.wally.playground.spring.Inheritance_mapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleRepositoryTest {

    @Autowired
    private SimpleService simpleRepository;

    @Test
    void save() {

//        Board board = Board.builder()
//                .title("board title")
//                .content("board content")
//                .build();
//
//        simpleRepository.save(board);

//        Notice notice = Notice.builder()
//                .title("notice title")
//                .content("notice content")
//                .boardType("NOTICE")
//                .like(10)
//                .build();



        simpleRepository.save();
    }
}