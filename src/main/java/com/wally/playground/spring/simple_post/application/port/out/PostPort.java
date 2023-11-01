package com.wally.playground.spring.simple_post.application.port.out;

import com.wally.playground.spring.simple_post.domain.entity.Post;

public interface PostPort {
    void insert(Post board);

}