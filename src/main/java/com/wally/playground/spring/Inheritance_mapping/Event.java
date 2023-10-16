package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.*;

@Table(name = "event")
@Entity
@DiscriminatorValue("EVENT")
public class Event extends Board {

    @Column
    private int views;  // 조회수

}
