package IfStatement;

import java.util.Scanner;

public class Qu14 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int a1,a2,a3,sum;
        System.out.print("Enter the angle ");
        a1=demo.nextInt();
        System.out.print("Enter the angle ");
        a2= demo.nextInt();
        System.out.print("Enter the angle ");
        a3= demo.nextInt();
        sum=a1+a2+a3;
        if (sum==180){
            System.out.println("The triangle is valid.");
        } else{
            System.out.println("The triangle is not valid.");
        }
    }
}
