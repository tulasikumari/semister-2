package IfStatement;

import java.util.Scanner;

public class Qu17 {
    public static void main(String[] args) {
        double r1, r2,a,b,c,determinant,sqrt;
        Scanner demo = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a= demo.nextDouble();
        System.out.println("Enter the value of b ");
        b=demo.nextDouble();
        System.out.println("Enter the value of c ");
        c = demo.nextDouble();
        determinant = (b*b)-(4*a*c);
        sqrt = Math.sqrt(determinant);
        if(determinant>0){
            r1 = (-b + sqrt)/(2*a);
            r2 = (-b - sqrt)/(2*a);
            System.out.println("Roots are  "+ r1 +" and "+r2);
        }else if(determinant == 0){
            System.out.println("Root is  "+(-b + sqrt)/(2*a));
        }
    }
}
