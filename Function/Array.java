//public class Function {
//    public static void main(String[] args) {
//        int i = 1;
//        while (i < 11) {
//            if (i % 2 == 0) {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//
//        }
//    }
//}

//    class class{
//    public static void main(String[] args) {
//        for (int num = 2; num < 31; num++) {
//            int flag = 0;
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) {
//                System.out.println(num);
//            }
//        }
//    }
//}

//public class Functions {
//    public static void main(String[] args) {
//        Functions functions = new Functions();
//        System.out.println(functions.addition(5, 10));
//        functions.subtraction();
//        functions.division(18, 6);
//        System.out.println(functions.multiplication());
//    }
//
//    public int addition(int a, int b) {
//        int sum = a + b;
//        return sum;
//    }
//
//    public void subtraction() {
//        int x = 5, y = 10;
//        int z = y - x;
//        System.out.println(z);
//    }
//
//    public void division(int s, int r) {
//        int c = s / r;
//        System.out.println(c);
//    }
//
//    public int multiplication() {
//        int w = 12, y = 2;
//        int p = w * y;
//        return p;
//    }
//}


//import java.util.Scanner;
//
//class MultiplyThreeNumbers {
//    public static void main(String[] args) {
//        int pro;
//        MultiplyThreeNumbers demo=new MultiplyThreeNumbers();
//        pro=demo.product();
//        System.out.println("The product: "+pro);
//
//    }
//    public int product(){
//        Scanner demo= new Scanner(System.in);
//        int p=1;
//        for (int i=1;i<4;i++){
//            System.out.println("Enter the number ");
//            int x= demo.nextInt();
//            p*=x;
//        }
//        return p;
//    }
//}

//import java.util.Scanner;
//
//class PrimeCheck {
//    public static void main(String[] args) {
//        PrimeCheck function=new PrimeCheck();
//        Scanner scanner= new Scanner(System.in);
//        System.out.print("Enter the number");
//        int n= scanner.nextInt();
//        function.primeCheck(n);
//    }
//    public void primeCheck(int num){
//        int a=0;
//        for (int i=2;i<num;i++){
//            if (num%i==0){
//                a=1;
//                break;
//            }
//        }
//        if (a==1){
//            System.out.println(num+ " is a composite number.");
//        }else{
//            System.out.println(num+ " is a prime number.");
//        }
//    }
//}

//import java.util.Scanner;
//
//class SimpleInterest {
//    public static void main(String[] args) {
//        SimpleInterest function=new SimpleInterest();
//        Scanner demo= new Scanner(System.in);
//        System.out.print("Enter the principal ");
//        int p=demo.nextInt();
//        System.out.print("Enter the rate ");
//        int r=demo.nextInt();
//        System.out.print("Enter the time ");
//        int t=demo.nextInt();
//        int SI= function.simpleInterest(p,t,r);
//        System.out.println("Simple Interest: "+SI);
//    }
//    public int simpleInterest(int p,int t,int r){
//        int SI=(p*t*r)/100;
//        return SI;
//
//    }
//}


import java.util.Arrays;
import java.util.Scanner;

//class SIWIthoutReturn {
//    public static void main(String[] args) {
//        SIWIthoutReturn function=new SIWIthoutReturn();
//        function.simpleInterest();
//    }
//    public void simpleInterest(){
//        Scanner demo= new Scanner(System.in);
//        System.out.print("Enter the principal ");
//        int p=demo.nextInt();
//        System.out.print("Enter the rate ");
//        int r=demo.nextInt();
//        System.out.print("Enter the time ");
//        int t=demo.nextInt();
//        int SI=(p*t*r)/100;
//        System.out.println("Simple Interest: "+SI);
//    }
//}

import java.util.Scanner;

//class AreaOfCircle {
//    public static void main(String[] args) {
//        AreaOfCircle demo= new AreaOfCircle();
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the radius");
//        int rad=scanner.nextInt();
//        float areaC=demo.area(rad);
//        System.out.println("The area of the circle: "+areaC);
//    }
//    public float area(int r){
//        float ar= (44*r*r)/7;
//        return ar;
//    }
//}
//single array
//class MultiplesOfThree {
//    public static void main(String[] args) {
//        printMultiples();
//    }
//    public static void printMultiples(){
//        Scanner scanner=new Scanner(System.in);
//        int [] mul= new int[15];
//        for (int i=0;i<15;i++){
//            System.out.print("Enter the number ");
//            int value= scanner.nextInt();
//            mul[i]=value;
//        }
//        for (int j=0;j<10;j++){
//            if(mul[j]%3==0){
//                System.out.println(mul[j]);
//            }
//        }
//    }
//}
// class OddNum {
//    public static void main(String[] args) {
//        oddNum();
//    }
//    public static void oddNum(){
//        int [] array = new int[10];
//        int n=0;
//        Scanner scanner= new Scanner(System.in);
//        for (int i=0;i<10;i++){
//            System.out.print("Enter the number");
//            int x= scanner.nextInt();
//            array[i]=x;
//            if (x%2!=0){
//                n++;
//            }
//        }
//        int c=0;
//        int [] array2= new int[n];
//        for (int j=0;j<10;j++){
//            if (array[j]%2!=0){
//                array2[c]=array[j];
//                c++;
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }
//
//}

//public class Array {
//    public static void main(String[] args) {
//        String []array1=createStringArray();
//        System.out.println(Arrays.toString(array1));
//    }
//
//    public static String[] createStringArray(){
//        Scanner demo= new Scanner(System.in);
//        String []array1=new String[10];
//        for (int i=0;i<10;i++){
//            System.out.print("Enter the value ");
//            String val1= demo.nextLine();
//            array1[i]=val1;
//        }
//        return array1;
//    }
//
//}
