package IfStatement;

import java.util.Scanner;

public class Qu5 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int num;
        System.out.print("Enter the number ");
        num= demo.nextInt();
        if (num%2==0){
            System.out.println("The number is even.");
        } else{
            System.out.println("The number is odd.");
        }
    }
}
