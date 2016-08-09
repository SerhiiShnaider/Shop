package com.gmail.shnapi007.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by elvis on 18.07.2016.
 */
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date addToBasketTime;
    @Column
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "basketToProduct",
            joinColumns = @JoinColumn(name = "basket_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> productList;

    public Basket() {
        this.addToBasketTime = Calendar.getInstance().getTime();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
