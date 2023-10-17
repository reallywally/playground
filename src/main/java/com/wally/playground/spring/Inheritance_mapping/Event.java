package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "event")
@Entity
@DiscriminatorValue("EVENT")
@Data
public class Event extends Board {

    @Column
    private int views;  // 조회수

}
