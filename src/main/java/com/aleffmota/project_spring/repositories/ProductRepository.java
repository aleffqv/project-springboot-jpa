package com.aleffmota.project_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aleffmota.project_spring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
