package com.gmail.shnapi007.services.implementation;

import com.gmail.shnapi007.dao.ProductDao;
import com.gmail.shnapi007.entity.Product;
import com.gmail.shnapi007.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Transactional
    public void add(String productName, String model, String description, int cost) {
        Product product = new Product(productName, model, description, cost);
        productDao.addNewProduct(product);
    }

    @Transactional
    public List<Product> findAll(){
        return productDao.findAllProducts();
    }

    @Override
    public Product findById(int id) {
        return productDao.findOneProduct(id);
    }
}

