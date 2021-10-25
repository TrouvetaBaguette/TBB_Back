package com.example.ttbbackpostgre.entity;


import java.util.List;

public class Bakery {
    private final int id;
    String name;
    String address;
    String phonenumber;
    final String Insee;
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
