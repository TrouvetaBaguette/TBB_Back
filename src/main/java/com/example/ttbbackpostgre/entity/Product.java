package com.example.ttbbackpostgre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;


@Data
@Table(name= "Product_Table")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String label;
    private int idbakery;
    private int weight;
    private int price;
    @OneToMany
    private List<Ingredient> ingredients;
    private int product_quantity;



}
