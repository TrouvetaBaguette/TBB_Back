package com.example.ttbbackpostgre.service;

import com.example.ttbbackpostgre.entity.Product;
import com.example.ttbbackpostgre.repository.ProductRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByLabel(String name) {
        return repository.findByLabel(name);
    }

    public void deleteProduct(int id) {
        repository.deleteById(id);
    }
    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setLabel(product.getLabel());
        existingProduct.setWeight(product.getWeight());
        return repository.save(existingProduct);
    }
}
