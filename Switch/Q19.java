package Switch;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        double unit, amt, extra, total;
        int temp;
        System.out.print("Enter the unit ");
        unit = demo.nextDouble();
        if (unit <= 50) {
            temp = 1;
        } else if (unit <= 150) {
            temp = 2;
        } else if (unit <= 250) {
            temp = 3;
        } else {
            temp = 4;
        }
        switch (temp) {
            case 1:
                amt = unit * 0.50;
                break;
            case 2:
                amt = 25 + ((unit - 50) * 0.75);
                break;
            case 3:
                amt = 100 + ((unit - 150) * 1.20);
                break;
            default:
                amt = 220 + ((unit - 250) * 1.50);
                break;
        }
        extra = amt * 0.2;
        total = extra + amt;
        System.out.println("The total electricity bill is Rs." + total);
    }
}

