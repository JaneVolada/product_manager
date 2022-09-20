package ru.netology.product;

public class Smartphone extends Product{
    protected String madeBy;

    public Smartphone (int id, String productType, String nameProduct, int price, String madeBy) {
        super(id, productType,nameProduct, price);
        this.madeBy = madeBy;
    }



}
