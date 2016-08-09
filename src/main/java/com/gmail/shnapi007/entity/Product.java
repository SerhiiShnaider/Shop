package com.gmail.shnapi007.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by elvis on 04.07.2016.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String productName;
    @Column
    private String model;
    @Column
    private String description;
    @Column
    private int cost;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "orderToProduct",
            joinColumns = @JoinColumn(name = "product_id" ),
            inverseJoinColumns = @JoinColumn(name = "order_id")
    )
    private List<Order> orderList;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "basketToProduct",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "basket_id")
    )
    private List<Basket>  basketList;
    public Product() {
    }

    public Product(String productName, String model, String description, int cost) {
        this.productName = productName;
        this.model = model;
        this.description = description;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
