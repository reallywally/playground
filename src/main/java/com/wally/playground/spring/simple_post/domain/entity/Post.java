package com.wally.playground.spring.simple_post.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "board")
@SuperBuilder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Post {

    @Id
    private Long postId;

    @Column
    private String category;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Boolean isSecret;

}