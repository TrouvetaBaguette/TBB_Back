package com.example.ttbbackpostgre.service;

import com.example.ttbbackpostgre.entity.Client;
import com.example.ttbbackpostgre.repository.ClientRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ClientService {
    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Client saveClient(Client client) {
        return repository.save(client);
    }

    public Client getClientById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Client getClientByName(String name) {
        return repository.findByName(name);
    }

    public void deleteClient(int id) {
        repository.deleteById(id);
    }

    public Client updateClient(Client client){
        Client existingClient = repository.findById(client.getId()).orElse(null);
        existingClient.setName(client.getName());
        existingClient.setAddress(client.getAddress());
        existingClient.setAllergies(client.getAllergies());
        return repository.save(existingClient);
    }
}
