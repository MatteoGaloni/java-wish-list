package org.lessons.java.christmas;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Scanner readList = new Scanner(new File(".list.txt"));

        int counter = 0;
        try {
            while(readList.hasNextLine()){
                String line = readList.nextLine();
                System.out.println(line);
                counter++;
            }
        } catch (Exception e) {
            System.out.println("something went wrong");
        } finally {
            readList.close();
        }

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
                counter++;
                System.out.println("Your list contains " + counter + " items");
            }

        }

        try (FileWriter list = new FileWriter(".list.txt", true)) {
            for (Gift gift : giftList) {
                list.write(gift.toString());
                list.write(System.lineSeparator());
            }
            System.out.println("Success");

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        System.out.println(giftList);

        scan.close();
    }
}
