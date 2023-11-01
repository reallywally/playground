package com.wally.playground.spring.simple_post.adapter.out.persistence;

import com.wally.playground.spring.simple_post.adapter.out.persistence.database.PostRepository;
import com.wally.playground.spring.simple_post.application.port.out.PostPort;
import com.wally.playground.spring.simple_post.domain.entity.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class PostAdapter implements PostPort {
    private final PostRepository postRepository;

    @Override
    public void insert(Post board) {
        postRepository.save(board);
    }
}
