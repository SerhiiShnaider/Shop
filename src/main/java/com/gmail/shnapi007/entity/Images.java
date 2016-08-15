package com.gmail.shnapi007.entity;


import javax.persistence.*;

/**
 * Created by Elvis on 12.08.2016.
 */
@Entity
public class Images {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    public Images() {
    }

    public Images(String image) {
        this.image = image;
    }
}
