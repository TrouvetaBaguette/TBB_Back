package com.example.ttbbackpostgre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name= "Client_Table")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue
    int id;
    String name;
    String address;
    @OneToMany
     List<String> allergies = new ArrayList<>();

    public Client(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }




}
