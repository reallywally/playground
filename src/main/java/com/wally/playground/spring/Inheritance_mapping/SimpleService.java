package com.wally.playground.spring.Inheritance_mapping;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class SimpleService {

    private final BoardRepository boardRepository;

    @Transactional
    public void save(Board notice) {
        boardRepository.save(notice);
    }
}
