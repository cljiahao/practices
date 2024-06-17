package org.meicode;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args) {

        ArrayList<Contacts> contacts = new ArrayList<>();
        ArrayList<Messages> messages = new ArrayList<>();

        boolean complete = false;
        while (!complete) {
            try {
                System.out.println("\nHi, Please select from menu.\n"
                        + "\t 1. Manage contacts \n"
                        + "\t 2. Messages \n"
                        + "\t 3. Quit");

                Scanner scanner = new Scanner(System.in);

                int x = scanner.nextInt();
                boolean innerComp = false;
                while (!innerComp) {
                    switch (x) {
                        case 1:
                            System.out.println("\nManaging Contacts Options:\n"
                                    + "\t 1. Show all contacts \n"
                                    + "\t 2. Add a contact \n"
                                    + "\t 3. Search for a contact \n"
                                    + "\t 4. Delete a contact \n"
                                    + "\t 5. Go back to previous menu");
                            int y = scanner.nextInt();
                            switch (y) {
                                case 1:
                                    for (Contacts c : contacts) {
                                        System.out.println("Name: " + c.getNames() + " , Phone Number: " + c.getPhoneNum());
                                    }
                                    break;
                                case 2:
                                    System.out.print("Please enter Name and Contact number: \n"
                                            + "\t Name: ");
                                    String name = scanner.next();
                                    System.out.print("\t Contact Number: ");
                                    int number = scanner.nextInt();
                                    contacts.add(new Contacts(name, number));
                                    break;
                                case 3:
                                    System.out.println("Please enter the Name you would like to search:");
                                    String person = scanner.next();
                                    int a = 0;
                                    for (Contacts s : contacts) {
                                        if (s.getNames().equals(person)) {
                                            System.out.println("Name: " + s.getNames() + " , Phone Number: " + s.getPhoneNum());
                                            a = 1;
                                            break;
                                        }
                                    }
                                    if (a == 0) {
                                        System.out.println("No such person!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Please enter the contact you would like to delete:");
                                    String delete = scanner.next();
                                    int i = 0;
                                    int j = 0;
                                    for (Contacts d : contacts) {
                                        if (d.getNames().equals(delete)) {
                                            System.out.println(i);
                                            j = i;
                                        }
                                        i++;
                                    }
                                    contacts.remove(j);
                                    break;
                                case 5:
                                    innerComp = true;
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("\nManaging Contacts Options:\n"
                                    + "\t 1. See the list of all Messages \n"
                                    + "\t 2. Send a new Message \n"
                                    + "\t 3. Go back to previous menu \n");
                            int z = scanner.nextInt();
                            switch (z) {
                                case 1:
                                    for (Messages m : messages) {
                                        System.out.println("Name: " + m.getName() + " , Message: " + m.getMessages());
                                    }
                                    break;
                                case 2:
                                    System.out.print("Please enter Name and Message you would like to send: \n"
                                            + "\t Name: ");
                                    String nameMes = scanner.next();
                                    System.out.print("\t Message: ");
                                    String Mes = scanner.next();
                                    messages.add(new Messages(nameMes, Mes));
                                    break;
                                case 3:
                                    innerComp = true;
                                    break;
                            }
                            break;

                        case 3:
                            complete = true;
                            innerComp = true;
                            System.out.println("Goodbye!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
            }
        }
    }
}
