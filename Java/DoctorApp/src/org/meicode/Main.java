package org.meicode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;

        Patient patient = new Patient("Tom",25);
        RightEye rightEye = new RightEye("Right Eye","Normal","Blue");
        LeftEye leftEye = new LeftEye("Left Eye","Short Sighted","Blue");
        Heart heart = new Heart("Heart","Normal",65);
        Stomach stomach = new Stomach("Stomach","PUD","Need to be fed");
        Skin skin = new Skin("Skin","Burned");

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        while (x < 6) {
            System.out.println("Choose an Organ:");
            System.out.println("    1. Left Eye");
            System.out.println("    2. Right Eye");
            System.out.println("    3. Heart");
            System.out.println("    4. Stomach");
            System.out.println("    5. Skin");
            System.out.println("    6. Quit");

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Name: " + leftEye.getName());
                System.out.println("Medical Condition: " + leftEye.getCondition());
                System.out.println("Color: " + leftEye.getColor());
                System.out.println("        1. Close the Eye");
                int inner = scanner.nextInt();
                if (inner == 1) {
                    System.out.println("Left Eye Closed");
                }
            }
            else if (input == 2) {
                System.out.println("Name: " + rightEye.getName());
                System.out.println("Medical Condition: " + rightEye.getCondition());
                System.out.println("Color: " + rightEye.getColor());
                System.out.println("        1. Close the Eye");
                int inner = scanner.nextInt();
                if (inner == 1) {
                    System.out.println("Right Eye Closed");
                }
            }
            else if (input == 3) {
                System.out.println("Name: " + heart.getName());
                System.out.println("Medical Condition: " + heart.getCondition());
                System.out.println("Color: " + heart.getHeartRate());
                System.out.println("        1. Change the heart rate");
                int inner = scanner.nextInt();
                if (inner == 1) {
                    System.out.println("Enter the new heart rate:");
                    int rate = scanner.nextInt();
                    heart.setHeartRate(rate);
                    System.out.println("Heart rate changed to: " + heart.getHeartRate());
                }
            }
            else if (input == 4) {
                System.out.println("Name: " + stomach.getName());
                System.out.println("Medical Condition: " + stomach.getCondition());
                System.out.println("Color: " + stomach.getAction());
                System.out.println("        1. Digest");
                int inner = scanner.nextInt();
                if (inner == 1) {
                    System.out.println("Digesting begin...");
                }
            }
            else if (input == 5) {
                System.out.println("Name: " + skin.getName());
                System.out.println("Medical Condition: " + skin.getCondition());
            }
            else {
                System.exit(0);
            }
        }
    }
}
