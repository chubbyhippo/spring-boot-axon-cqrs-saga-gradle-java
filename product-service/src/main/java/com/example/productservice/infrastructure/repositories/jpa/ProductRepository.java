package com.example.productservice.infrastructure.repositories.jpa;

import com.example.productservice.domain.model.projections.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
