package com.wally.playground.spring.hexagonal_company.product.adapter.out.persistence.database;

import com.wally.playground.spring.hexagonal_company.product.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
