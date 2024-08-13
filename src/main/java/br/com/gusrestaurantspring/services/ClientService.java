package br.com.gusrestaurantspring.services;

import br.com.gusrestaurantspring.models.dtos.ClientDto;
import br.com.gusrestaurantspring.models.entities.Client;
import br.com.gusrestaurantspring.models.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        client.setName(clientDto.name());
        client.setDocument(clientDto.document());
        return clientRepository.save(client);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client findById(UUID id) {
        return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("ID not found"));
    }

    public List<Client> findByName(String name) {
        return clientRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Client> findByDocument(String document) {
        return clientRepository.findByDocumentContainingIgnoreCase(document);
    }

    public Client updateClient(UUID id, ClientDto clientDto) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        Client client = null;
        if(optionalClient.isPresent()) {
            client = optionalClient.get();
            client.setName(clientDto.name());
            client.setDocument(clientDto.document());
        } else {
            throw new RuntimeException("Client not found");
        }

        return clientRepository.save(client);
    }

    public void deleteClient(UUID id) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("ID not found"));
        clientRepository.delete(client);
    }
}
