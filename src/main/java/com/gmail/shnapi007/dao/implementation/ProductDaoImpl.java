package com.gmail.shnapi007.dao.implementation;

import com.gmail.shnapi007.dao.ProductDao;
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
public class ProductDaoImpl implements ProductDao {
    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void addNewProduct(Product product) {
        entityManager.persist(product);
    }

    @Transactional
    public List<Product> findAllProducts() {
        return entityManager.createQuery("from Product").getResultList();
    }

    @Transactional
    public void deleteProduct(Product product){
        entityManager.remove(product);
    }

    @Override
    public Product findOneProduct(int id) {
        return entityManager.find(Product.class, id);
    }
}
