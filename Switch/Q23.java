package Switch;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int n1, n2, x, temp;
        System.out.println("Enter the number ");
        n1 = demo.nextInt();
        System.out.println("Enter the number ");
        n2 = demo.nextInt();
        if (n1 != n2) {
            x = 0;
        } else {
            x = 1;
        }
        ;
        switch (x) {
            case 0:
                temp = n1;
                n1 = n2;
                n2 = temp;
                break;
            default:
                break;
        }
    }
}
