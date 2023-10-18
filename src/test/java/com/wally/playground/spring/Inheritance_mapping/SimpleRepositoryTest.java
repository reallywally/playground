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
        Notice notice = Notice.builder()
                .title("notice title2")
                .content("notice content2")
                .likeCount(12)
                .build();

        simpleRepository.save(notice);
    }
}