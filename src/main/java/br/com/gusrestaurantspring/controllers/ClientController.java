package br.com.gusrestaurantspring.controllers;

import br.com.gusrestaurantspring.models.dtos.ClientDto;
import br.com.gusrestaurantspring.models.entities.Client;
import br.com.gusrestaurantspring.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    public Client create(@RequestBody ClientDto clientDto) {
        return clientService.create(clientDto);
    }
}
