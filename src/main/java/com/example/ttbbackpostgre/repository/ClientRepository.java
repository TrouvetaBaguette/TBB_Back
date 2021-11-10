package com.example.ttbbackpostgre.repository;


import com.example.ttbbackpostgre.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer>, CrudRepository<Client, Integer> {
    Client findByName(String name);
}
