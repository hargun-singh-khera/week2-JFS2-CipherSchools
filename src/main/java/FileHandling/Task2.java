package FileHandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    /*Prepare a shopping cart(using ArrayList).
    * Ask user how many products user want to enter in shopping cart.
    * Get all the products and add them into shopping cart.
    * Prepare a file cart.txt containing all products entered by user.*/
    public static void main(String[] args) throws IOException {
        ArrayList<String> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many products do you want to enter in the shopping cart?");
        FileWriter fw = new FileWriter("F:\\cart.txt",true);
        int count = sc.nextInt();
        for (int i=0; i< count;i++) {
            System.out.print("Enter the name of product " + (i+1) + " : ");
            String product = sc.next();
            cart.add(product);
            fw.write(product + "\n");
        }
        fw.flush();
        fw.close();
        System.out.println("File created successfully of all the products entered in cart");
    }
}
