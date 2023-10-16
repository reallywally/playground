package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.*;

@Table(name = "notice")
@Entity
@DiscriminatorValue("NOTICE")
public class Notice extends Board {

    @Column
    private int like;  // 좋아요

}
