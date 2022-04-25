package Switch;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        int a=scanner.nextInt();
        int odd =a%2;
        switch (odd){
            case 1:
                System.out.println("it is odd.");
                break;
            default:
                System.out.println("it is even");
                break;

        }
    }
}
