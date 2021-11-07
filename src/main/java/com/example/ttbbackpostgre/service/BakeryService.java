package com.example.ttbbackpostgre.service;

import com.example.ttbbackpostgre.entity.Bakery;
import com.example.ttbbackpostgre.entity.Product;
import com.example.ttbbackpostgre.repository.BakeryRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class BakeryService {
    private BakeryRepository repository;

    @Autowired
    public BakeryService(BakeryRepository repository) {
        this.repository = repository;
    }

    public Bakery saveBakery(Bakery bakery) {
        return repository.save(bakery);
    }


    public Bakery getBakeryById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Bakery getBakeryByName(String name) {
        return repository.findByName(name);
    }

    public void deleteBakery(int id) {
        repository.deleteById(id);
    }
    public Bakery updateBakery(Bakery bakery){
        Bakery existingBakery=repository.findById(bakery.getId()).orElse(null);
        existingBakery.setName(bakery.getName());
        existingBakery.setAddress(bakery.getAddress());
        existingBakery.setPhonenumber(bakery.getPhonenumber());
        return repository.save(existingBakery);
    }
}
