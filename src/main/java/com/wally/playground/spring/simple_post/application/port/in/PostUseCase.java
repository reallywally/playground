package com.wally.playground.spring.simple_post.application.port.in;

import com.wally.playground.spring.simple_post.application.port.in.command.PostCreateCommand;

public interface PostUseCase {
    void createPost(PostCreateCommand postCreateCommand);
}
