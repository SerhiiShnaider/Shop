package com.gmail.shnapi007.services.implementation;

import com.gmail.shnapi007.dao.BasketDao;
import com.gmail.shnapi007.entity.Product;
import com.gmail.shnapi007.services.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by elvis on 18.07.2016.
 */
@Service
public class BasketServiceImpl implements BasketService {
    @Autowired
    private BasketDao basketDao;

    @Override
    public void addProductToBasket(Product product) {
        basketDao.addProductToBasket(product);
    }
}
