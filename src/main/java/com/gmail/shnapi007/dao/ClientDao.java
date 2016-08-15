package com.gmail.shnapi007.dao;

import com.gmail.shnapi007.entity.Client;

import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
public interface ClientDao {
    void addNewClient(Client client);

    void deleteClient(Client client);

    List<Client> findAllClients();

    Client findClientByLogin(String login);
    Client findClientById(int clientId);
}
