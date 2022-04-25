package IfStatement;

import java.util.Scanner;

public class Qu3 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int num;
        System.out.print("Enter the number ");
        num = demo.nextInt();
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("Zero");
        }
    }
}
