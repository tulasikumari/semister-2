package Switch;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int h, m, time, x;
        System.out.println("Enter the hours ");
        h = demo.nextInt();
        System.out.println("Enter the minutes ");
        m = demo.nextInt();
        if (h >= 12 && h < 24) {
            x = 1;
        } else {
            x = 0;
        }
        switch (x) {
            case 0:
                System.out.println("The time is in AM ");
                break;
            default:
                System.out.println("The time is in PM ");
                break;
        }
    }
}
