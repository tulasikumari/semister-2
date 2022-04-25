package IfStatement;

import java.util.Scanner;

public class Qu6 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int year;
        boolean leap;
        System.out.print("Enter the year ");
        year= demo.nextInt();
        if (year%400==0)
        {
            System.out.println("It is a leap year.");
        }
        else if((year%4==0)&&(year%100!=0)) {
            System.out.println("It is a leap year.");
        }
        else {
            System.out.println("It is not a leap year.");
        }
    }
}
