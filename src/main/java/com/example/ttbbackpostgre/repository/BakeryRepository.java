package com.example.ttbbackpostgre.repository;

import com.example.ttbbackpostgre.entity.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface BakeryRepository extends JpaRepository<Bakery,Integer>, CrudRepository<Bakery, Integer>{
    Bakery findByName(String name);
}
