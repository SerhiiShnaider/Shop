package com.gmail.shnapi007.dao;

import com.gmail.shnapi007.entity.Product;

import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
public interface ProductDao {

    void addNewProduct(Product product);

    List<Product> findAllProducts();

    void deleteProduct(Product product);

    Product findOneProduct(int id);


}
