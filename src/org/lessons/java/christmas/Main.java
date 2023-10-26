package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Gift> giftList = new ArrayList<>();

        boolean stop = false;

        while(!stop){
            System.out.println("Would you add a gift to you list? Press y or n");
            stop = scan.nextLine().equals("n");

            if (!stop) {
                System.out.println("Who's the gift for?");
                String recipient = scan.nextLine();

                System.out.println("Please enter the gift description");
                String description = scan.nextLine();

                giftList.add(new Gift(recipient,description));
                System.out.println("Your list contains " + giftList.size() + " items");
            }

        }

        System.out.println(giftList);

        scan.close();
    }
}
