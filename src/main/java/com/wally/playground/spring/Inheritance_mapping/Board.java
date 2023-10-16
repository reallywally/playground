package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.*;

@Table(name = "board")
@Entity
@DiscriminatorColumn(name = "board_type")
@Inheritance(strategy = InheritanceType.JOINED)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
