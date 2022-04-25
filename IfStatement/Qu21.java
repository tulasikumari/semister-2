package IfStatement;

import java.util.Scanner;

public class Qu21 {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        double unit,amt,extra,total;
        System.out.print("Enter the unit ");
        unit= demo.nextDouble();
        if(unit <= 50)
        {
            amt = unit * 0.50;
        }
        else if(unit <= 150)
        {
            amt = 25 + ((unit-50) * 0.75);
        }
        else if(unit <= 250)
        {
            amt = 100 + ((unit-150) * 1.20);
        }
        else
        {
            amt = 220 + ((unit-250) * 1.50);
        }
        extra=amt*0.2;
        total=extra+amt;
        System.out.println("The total electricity bill is Rs."+total);
    }
}
