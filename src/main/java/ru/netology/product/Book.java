package ru.netology.product;

public class Book extends Product {
    protected String author;

    public Book (int id, String productType, String nameProduct, int price, String author){
        super (id, productType,nameProduct, price);
        this.author = author;

    }
}
