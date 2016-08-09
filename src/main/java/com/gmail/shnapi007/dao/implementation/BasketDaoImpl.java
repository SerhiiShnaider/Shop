package com.gmail.shnapi007.dao.implementation;

import com.gmail.shnapi007.dao.BasketDao;
import com.gmail.shnapi007.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by elvis on 18.07.2016.
 */
@Repository
public class BasketDaoImpl implements BasketDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;




    @Override
    public void addProductToBasket(Product product) {
        entityManager.persist(product);
    }
}
