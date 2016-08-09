package com.gmail.shnapi007.dao;

import com.gmail.shnapi007.entity.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by elvis on 18.07.2016.
 */
public interface BasketDao {
    void addProductToBasket(Product product);
}
