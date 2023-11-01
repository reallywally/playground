package com.wally.playground.spring.simple_post.application.port.in.command;

import com.wally.playground.spring.hexagonal_company.common.SelfValidating;
import com.wally.playground.spring.simple_post.domain.entity.Post;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public class PostCreateCommand extends SelfValidating<PostCreateCommand> {
    @NotNull
    @Size(min = 1, max = 100)
    private String name;

    @Size(max = 100)
    private String description;

    @NotNull
    @Min(10)
    private int price;

    @NotNull
    private String isbn;


    public Post toEntity() {
        return Post.builder()
                .build();
    }
}
