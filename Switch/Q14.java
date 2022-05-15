package Switch;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2, a3, x;
        System.out.print("Enter the side ");
        a1 = scanner.nextInt();
        System.out.print("Enter the side ");
        a2 = scanner.nextInt();
        System.out.print("Enter the side ");
        a3 = scanner.nextInt();
        if ((a1 == a2) && (a2 == a3)) {
            x = 1;
        } else if ((a1 == a2) || (a2 == a3) || (a3 == a1)) {
            x = 2;
        } else {
            x = 3;
        }
        switch (x) {
            case 1:
                System.out.println("The triangle is equilateral.");
                break;
            case 2:
                System.out.println("The triangle is isosceles.");
                break;
            default:
                System.out.println("The triangle is scalene.");
                break;
        }
    }
}
