package com.gmail.shnapi007.services;


import com.gmail.shnapi007.entity.Product;

import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
public interface OrderService {
    public void add(List<Product> productList, String clientId);
}
