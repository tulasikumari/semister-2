package IfStatement;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the week days");
        int weekdays = scanner.nextInt();
        if (weekdays == 1) {
            System.out.println("sunday");
        } else if (weekdays == 2) {
            System.out.println("monday");
        } else if (weekdays == 3) {
            System.out.println("tuesday");

        } else if (weekdays == 4) {
            System.out.println("wednesday");
        } else if (weekdays == 5) {
            System.out.println("thrusday");

        } else if (weekdays == 6) {
            System.out.println("friday");
        } else if (weekdays == 7) {
            System.out.println("saturday");
        }
    }
}
