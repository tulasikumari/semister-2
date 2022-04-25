package IfStatement;

import java.util.Scanner;

public class Qu13 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int amount,notes;
        System.out.print("Enter the amount ");
        amount= demo.nextInt();
        if (amount%5==0){
            notes=amount/5;
            System.out.println("The total number of notes is "+notes);
        }
        else{
            System.out.println("Invalid Input");
        }

    }
}
