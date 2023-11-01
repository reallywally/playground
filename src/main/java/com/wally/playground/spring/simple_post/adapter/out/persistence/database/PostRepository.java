package com.wally.playground.spring.simple_post.adapter.out.persistence.database;

import com.wally.playground.spring.simple_post.domain.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
