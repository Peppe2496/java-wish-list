package org.lessons.java.wishlist;

import java.util.HashSet;
import java.util.Scanner;

public class Wishlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creo un insieme di regali senza duplicati
        HashSet<String> wishlist = new HashSet<>();

        boolean stop = false;
        while (!stop){
            System.out.println("Insert new gift(y/n)");
            String answer = scanner.nextLine();
            switch (answer){
                case "y":
                    //aggiungo un regalo
                    System.out.println("Gift:");
                    String gift = scanner.nextLine();
                    boolean added = wishlist.add(gift);
                    if (!added){
                        System.out.println("Gift already added");
                    }
                    break;
                case "n":
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid answer");
                    break;
            }
        }

        System.out.println(wishlist);

        for (String element: wishlist){
            System.out.println(element.toString());
        }

        scanner.close();
    }
}
