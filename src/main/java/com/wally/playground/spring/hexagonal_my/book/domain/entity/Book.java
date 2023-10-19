package com.wally.playground.spring.hexagonal_my.book.domain.entity;

import com.wally.playground.spring.hexagonal_my.book.domain.model.BookCategory;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "book")
@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private int price;

    @Column
    private String isbn;

    @Column
    @Enumerated(EnumType.STRING)
    private BookCategory category;

}
