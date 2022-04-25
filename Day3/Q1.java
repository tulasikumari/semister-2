package Day3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        String name,rollNo,age,PhoneNo;
        System.out.println("enter the name:");
        name=demo.nextLine();
        System.out.println("enter the rollNo");
        rollNo=demo.nextLine();
        System.out.println("enter the age");
        age=demo.nextLine();
        System.out.println("enter the phoneNo");
        PhoneNo=demo.nextLine();
        System.out.println("Name:"+name+"\n RollNO:"+rollNo+"\nAge"+age+"\nPhoneNo:"+PhoneNo);
    }
}
