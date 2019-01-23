package com.price.impl;


import javax.persistence.*;

@Entity
@Table(name = "PRICE")
public class PriceImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "sku")
    private String sku;

    @Column(name = "LIST_PRICE")
    private double listPrice;

    @Column(name = "SALE_PRICE")
    private double salePrice;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}

