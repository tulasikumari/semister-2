package Day3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        int x,y,sum,product;
        System.out.println("enter the value is x");
        x=demo.nextInt();
        System.out.println("enter hte the value of y");
        y=demo.nextInt();
        sum=x+y;
        product=x*y;
        System.out.println("sum:"+sum+ "\nproduct:"+product);
    }
}
