package IfStatement;

import java.util.Scanner;

public class Qu20 {
    public class Q20 {
        public static void main(String[] args) {
            Scanner demo = new Scanner(System.in);
            double da, hra, basic, gross;
            System.out.print("Enter the basic salary ");
            basic = demo.nextDouble();
            if (basic <= 10000) {
                da = basic * 0.8;
                hra = basic * 0.2;
            } else if (basic <= 20000) {
                da = basic * 0.9;
                hra = basic * 0.25;
            } else {
                da = basic * 0.95;
                hra = basic * 0.3;
            }
            gross = basic + hra + da;
            System.out.println("The gross salary is Rs." + gross);
        }
    }
}
