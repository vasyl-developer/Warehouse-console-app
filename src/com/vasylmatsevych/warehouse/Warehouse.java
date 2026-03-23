package com.vasylmatsevych.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, double price, int quantity){
        products.add(new Product(name, price, quantity));
    }

    public double getTotalPrice(){
        double totalPrice = 0.0;
        for (Product product : products){
            totalPrice += product.getPrice()*product.getQuantity();
        }
        return totalPrice;
    }

    public int getTotalQuantity(){
        int totalQuantity = 0;
        for (Product product : products) {
            totalQuantity += product.getQuantity();
        }
        return totalQuantity;
    }
    public void printInfo(){
        System.out.println("\n======= WAREHOUSE =======");
        if (products.isEmpty()) {
            System.out.println("\nWarehouse is empty.");
            System.out.println("\n=========================");
            return;
        }
        System.out.println("\nProducts: ");
        for (Product product : products) {
            System.out.println(" - " + product.getName());
        }
        System.out.println("\nTotal units: " + getTotalQuantity());
        System.out.printf("Total stock value: $%.2f\n", getTotalPrice());
        System.out.println("\n=========================");
    }

}