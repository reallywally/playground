package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class SimpleService {

    private final BoardRepository boardRepository;

    @Transactional
    public void save() {
//        Notice notice = new Notice();
//        notice.setTitle("notice title");
//        notice.setContent("notice content");
//        notice.setLike(10);
        Event event = new Event();
        event.setContent("event content");
        event.setTitle("event title");
        event.setViews(100);

        boardRepository.save(event);
    }

}
