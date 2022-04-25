package IfStatement;

import java.util.Scanner;

public class Q2UsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the week days");
        int weekdays = scanner.nextInt();
        switch (weekdays){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wedneday");
                break;
            case 5:
                System.out.println("thrusday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");





            }
    }
}
