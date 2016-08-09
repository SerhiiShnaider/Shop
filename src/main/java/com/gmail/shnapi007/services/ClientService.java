package com.gmail.shnapi007.services;

import com.gmail.shnapi007.entity.Client;

import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
public interface ClientService {

    void add(Client client);

    List<Client> findAll();

    void add(String name, String surname, int age, String email, String phone, String password);
}

