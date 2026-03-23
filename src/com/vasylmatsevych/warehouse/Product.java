package com.vasylmatsevych.warehouse;

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product (String name, double price, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public double getPrice(){return price;}
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
}