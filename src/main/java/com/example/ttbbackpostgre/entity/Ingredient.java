package com.example.ttbbackpostgre.entity;


import java.util.Objects;

public class Ingredient {
    final private String name;
    private String ingredient_quantity;

    public Ingredient(String name, String quantity) {
        this.name = name;
        this.ingredient_quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return ingredient_quantity;
    }

    public void setQuantity(String quantity) {
        this.ingredient_quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(name, that.name) && Objects.equals(ingredient_quantity, that.ingredient_quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ingredient_quantity);
    }
}
