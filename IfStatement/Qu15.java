package IfStatement;

import java.util.Scanner;

public class Qu15 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int a1, a2, a3;
        System.out.print("Enter the side ");
        a1 = demo.nextInt();
        System.out.print("Enter the side ");
        a2 = demo.nextInt();
        System.out.print("Enter the side ");
        a3 = demo.nextInt();
        if ((a1 < (a2 + a3)) && (a2 < (a1 + a3)) && a3 < (a1 + a2)) {
            System.out.println("The triangle is valid.");
        } else{
            System.out.println("The triangle is not valid.");
        }
    }
}
