package com.example.ttbbackpostgre.repository;

import com.example.ttbbackpostgre.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>, CrudRepository<Product, Integer> {

    Product findByLabel(String name);
}
