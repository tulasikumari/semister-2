package Switch;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner demo = new Scanner(System.in);
        int SP, CP, val, x;
        System.out.print("Enter the cost price ");
        CP = demo.nextInt();
        System.out.print("Enter the selling price ");
        SP = demo.nextInt();
        if (SP > CP) {
            x = 1;
        } else {
            x = 0;
        }
        switch (x) {
            case 1:
                val = SP - CP;
                System.out.println("Profit: " + val);
                break;
            default:
                val = CP - SP;
                System.out.println("Loss:" + val);
        }
    }
}