package com.price.dto;

import javax.persistence.*;


public class PriceDto {


        private long id;

        private String sku;

        private double listPrice;

        private double salePrice;

    public PriceDto() {
    }

    public PriceDto(long id, String sku, double listPrice, double salePrice) {
        this.id = id;
        this.sku = sku;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
    }

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
