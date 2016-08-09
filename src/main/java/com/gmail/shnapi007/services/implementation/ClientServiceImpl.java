package com.gmail.shnapi007.services.implementation;

import com.gmail.shnapi007.dao.ClientDao;
import com.gmail.shnapi007.entity.Client;
import com.gmail.shnapi007.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
@Service
public class ClientServiceImpl implements ClientService, UserDetailsService {
    @Autowired
    private ClientDao clientDao;

    @Transactional
    public void add(Client client) {
        clientDao.addNewClient(client);
    }

    @Transactional
    public List<Client> findAll(){
        return clientDao.findAllClients();
    }

    @Override
    public void add(String name, String surname, int age, String email, String phone, String password) {
        Client client = new Client(name, surname, age, email, phone, password);
        clientDao.addNewClient(client);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Client client = clientDao.findClientByLogin(login);
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(String.valueOf(client.getId()), client.getPassword(), authorities);
    }
}
