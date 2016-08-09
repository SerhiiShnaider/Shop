package com.gmail.shnapi007.dao.implementation;

import com.gmail.shnapi007.dao.OrderDao;
import com.gmail.shnapi007.entity.Order;
import com.gmail.shnapi007.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
@Repository
public class OrderDaoImpl implements OrderDao {
    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void addNewOrder(Order order) {
        entityManager.persist(order);
    }
}
