package com.gmail.shnapi007.services;

import com.gmail.shnapi007.entity.Product;


import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
public interface ProductService {
    void add(String productName, String model, String description, int cost);

    List<Product> findAll();

    Product findById(int id);
}
