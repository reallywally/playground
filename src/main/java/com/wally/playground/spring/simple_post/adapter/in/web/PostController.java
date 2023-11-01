package com.wally.playground.spring.simple_post.adapter.in.web;

import com.wally.playground.spring.simple_post.adapter.in.web.model.PostCreateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PostController {


    @PostMapping("/posts")
    public String createPost(@RequestBody PostCreateRequest postCreateRequest) {


        return "";
    }

}
