package Day3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        double l,b,area;
        System.out.println("enter the length ");
        l=demo.nextDouble();
        System.out.println("enter the breath");
        b=demo.nextDouble();
        area=l*b;
        int castedArea=(int) (area);
        System.out.println("castedArea"+area);
    }
}
