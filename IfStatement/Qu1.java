//package IfStatement;
//
//public class Qu1 {
//    public static void main(String[] args) {
//        int num = 12;
//        if (num > 10) {
//            System.out.println("maximum num");
//        } else if (num < 10) {
//            System.out.println("minimum num");
//        } else {
//            System.out.println("non");
//        }
//    }
//}
package IfStatement;

import java.util.Scanner;

public class Qu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.println("enter the x ");
        x = scanner.nextInt();
        System.out.println("enter the y");
        y = scanner.nextInt();
        if (x > y) {
            System.out.println(x + "x is greater ");
        } else {
            System.out.println(y + "y is greater ");
        }
        ;
    }
}