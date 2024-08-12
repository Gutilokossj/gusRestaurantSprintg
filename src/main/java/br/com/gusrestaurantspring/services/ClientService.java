package br.com.gusrestaurantspring.services;

import br.com.gusrestaurantspring.models.dtos.ClientDto;
import br.com.gusrestaurantspring.models.entities.Client;
import br.com.gusrestaurantspring.models.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    private ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client create(ClientDto clientDto) {
        Client client = new Client();
        client.setId(UUID.randomUUID());

    }
}
