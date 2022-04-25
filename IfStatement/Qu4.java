package IfStatement;

import java.util.Scanner;

public class Qu4 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int num;
        System.out.print("Enter the number ");
        num= demo.nextInt();
        if ((num%5==0)&(num%11==0)){
            System.out.println("The number is divisible by 5 and 11.");
        }
        else {
            System.out.println("The number is not divisible by both 5 and 11.");
        }
    }
}

