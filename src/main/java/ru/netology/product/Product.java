package ru.netology.product;

public class Product {
    protected int id;
    protected String productType;
    protected String nameProduct;
    protected int price;

    public int getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public Product(int id, String productType, String nameProduct, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.productType = productType;
        this.price = price;
    }
}
