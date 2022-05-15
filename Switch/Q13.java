package Switch;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a1,a2,a3,sum;
        System.out.print("Enter the angle ");
        a1=scanner.nextInt();
        System.out.print("Enter the angle ");
        a2= scanner.nextInt();
        System.out.print("Enter the angle ");
        a3= scanner.nextInt();
        sum=a1+a2+a3;
        switch (sum){
            case 180:
                System.out.println("The triangle is valid.");
                break;
            default:
                System.out.println("The triangle is not valid.");
                break;
        }
    }
}

