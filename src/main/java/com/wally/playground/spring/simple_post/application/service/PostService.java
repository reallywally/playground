package com.wally.playground.spring.simple_post.application.service;

import com.wally.playground.spring.simple_post.application.port.in.PostUseCase;
import com.wally.playground.spring.simple_post.application.port.in.command.PostCreateCommand;
import com.wally.playground.spring.simple_post.application.port.out.PostPort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService implements PostUseCase {
    private final PostPort postPort;


    @Override
    public void createPost(PostCreateCommand postCreateCommand) {
        postPort.insert(postCreateCommand.toEntity());
    }
}
