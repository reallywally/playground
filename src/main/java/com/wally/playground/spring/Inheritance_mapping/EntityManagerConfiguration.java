package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntityManagerConfiguration {
    @PersistenceContext
    private EntityManager entityManager;
}
