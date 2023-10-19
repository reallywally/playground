package com.wally.playground.spring.hexagonal_my.book.adapter.out.persistence.database;

import com.wally.playground.spring.hexagonal_my.book.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
