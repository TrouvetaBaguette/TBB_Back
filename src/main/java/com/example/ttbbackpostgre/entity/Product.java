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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;
    private int idbakery;
    private int weight;
    private int price;
    @OneToMany
    private List<Ingredient> ingredients;
    private int product_quantity;

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
