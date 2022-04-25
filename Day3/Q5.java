package Day3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        int x,y,sum,pro,div;
        System.out.println("enter the value of x");
        x=demo.nextInt();
        System.out.println("enter the value of y");
        y=demo.nextInt();
        sum=x+y;
        pro=x*y;
        div=pro/sum;
        System.out.println("sum:"+sum+"\nproduct:"+pro+"\ndivsion"+div);
    }
}
