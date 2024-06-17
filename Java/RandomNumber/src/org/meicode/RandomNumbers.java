package org.meicode;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        System.out.println("Please Enter your Name :");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        System.out.println("Hello " + Name);

        System.out.println("Do you want to Start?");
        String Start = scanner.next();

        if (Start.matches("Yes|yes|YES")) {

            Random random = new Random();
            int x = random.nextInt(20);
            int i = 0;
            System.out.println("Guess a Number :");

            while (i != 5) {
                int input = scanner.nextInt();
                i++;
                if (x == input) {
                    System.out.println("You're Right!");
                    System.exit(0);
                } else if (x < input) {
                    System.out.println("Lower!");
                } else if (x > input) {
                    System.out.println("Higher!");
                }
            }
            System.out.println("Run out of tries! Number is " + x);


        }




    }
}
