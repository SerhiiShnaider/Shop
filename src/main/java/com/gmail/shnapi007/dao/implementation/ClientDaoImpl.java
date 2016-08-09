package com.gmail.shnapi007.dao.implementation;

import com.gmail.shnapi007.dao.ClientDao;
import com.gmail.shnapi007.entity.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
@Repository
public class ClientDaoImpl implements ClientDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void addNewClient(Client client) {
        entityManager.persist(client);
    }

    @Transactional
    public void deleteClient(Client client) {
        entityManager.remove(client);
    }

    @Transactional
    public List<Client> findAllClients() {
        return entityManager.createQuery("from Client").getResultList();
    }

    @Override
    public Client findClientByLogin(String login) {
        Query query = entityManager.createQuery("SELECT c FROM Client c WHERE c.email like :login or c.phone like :login");
        query.setParameter("login", login);
        Client client = (Client) query.getSingleResult();
        return client;
    }

    @Override
    public Client findClientById(String clientId) {
        /*(Client) entityManager.createQuery("from Client where id = :id").setParameter("id", Integer.parseInt(clientId)).getSingleResult();*/
        Query query = entityManager.createQuery("FROM Client WHERE id = :clientId");
        query.setParameter("clientId", Integer.parseInt(clientId));
        Client client = (Client) query.getSingleResult();
        return client;
    }
}
