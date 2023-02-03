package CollectionFramework;

import java.util.*;

class Product {
    String title;
    int price;
}
public class Task1 {

    /*Write a Java program to ask user if he/she wants to add item in shopping cart
    item: product Title and Price
    show the total product name in ascending order
    total amount of all products

    add more? y, add more? y, add more? n
    total bill: XX
    Products list (ascending order)*/
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product p = new Product();
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;
        boolean isMoreItem=true;
        while(isMoreItem) {
            System.out.println("Enter product name");
            p.title = sc.next();
            System.out.println("Enter product price");
            p.price = sc.nextInt();
            totalSum+=p.price;
            products.add(p);
            System.out.println("Do you want to add more item in the shopping cart?");
            String st = sc.next();
            switch (st) {
                case "yes" -> isMoreItem = true;
                case "y" -> isMoreItem = true;
                case "no" -> isMoreItem = false;
                case "n" -> isMoreItem = false;
                default -> System.out.println("Please provide values in yes or no format or y/n");
            }
        }

        System.out.println("Total Bill: "+totalSum);


    }
}

