package com.example.ttbbackpostgre.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@Table(name= "Bakery_Table")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bakery {
    @Id
    @GeneratedValue
    int id;
    String name;
    String address;
    String phonenumber;
    String Insee;
    @OneToMany
    List<Product> products;

    public Bakery(int id, String name, String address, String insee) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.Insee = insee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getInsee() {
        return Insee;
    }

    public List<Product> getProducts() {
        return products;
    }
}
