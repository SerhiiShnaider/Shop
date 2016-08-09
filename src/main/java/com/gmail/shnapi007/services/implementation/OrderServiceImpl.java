package com.gmail.shnapi007.services.implementation;

import com.gmail.shnapi007.dao.ClientDao;
import com.gmail.shnapi007.dao.OrderDao;
import com.gmail.shnapi007.entity.Client;
import com.gmail.shnapi007.entity.Order;
import com.gmail.shnapi007.entity.Product;
import com.gmail.shnapi007.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ClientDao clientDao;

    @Transactional
    @Override
    public void add(List<Product> productList, String clientId) {
        System.out.println(productList);
        Order order = new Order();
        order.setProductList(productList);
        Client client = clientDao.findClientById(clientId);
        System.out.println(client);
        order.setClient(client);
        orderDao.addNewOrder(order);
    }
}
