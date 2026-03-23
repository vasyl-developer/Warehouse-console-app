package com.vasylmatsevych.warehouse;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        System.out.println("Welcome! Type \"stop\" as the product name to finish.");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int i = 0;
        do{
            i++;
            System.out.print("Enter the name of product #" + i + ": ");
            String productName = scan.nextLine();
            productName = productName.trim();
            while (productName.isEmpty()) {
                System.out.print("Product name cannot be empty. Please try again: ");
                productName = scan.nextLine().trim();
            }
            if (productName.equalsIgnoreCase("stop")){
                warehouse.printInfo();
                break;
            }

            System.out.print("Enter the quantity of this product: ");
            int productQuantity= scan.nextInt();
            while (productQuantity < 0){
                System.out.print("Quantity cannot be negative. Please try again: ");
                productQuantity = scan.nextInt();
            }
            System.out.print("Enter the unit price ($): ");
            double productPrice = scan.nextDouble();
            while (productPrice <= 0) {
                System.out.print("Price must be greater than 0. Please try again: ");
                productPrice = scan.nextDouble();
            }
            scan.nextLine();
            warehouse.addProduct(productName, productPrice, productQuantity);

        }while (true);
        scan.close();
    }
}