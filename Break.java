import java.util.Scanner;
//
//public class Break {
//    public static void main(String[] args) {
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }
//    }
//}

//class Q2{
//    public static void main(String[] args) {
//        for (int i=10;i<=30;i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//}

// class Q3{
//    public static void main(String[] args) {
//        for(int i=10;i<+30;i++){
//            System.out.println(i);
//            i++;
//        }
//    }
//}

class Q4Count {
    public static void main(String[] args) {
        int Evencount = 0;
        int Oddcount = 0;
        for (int i = 10; i <= 30; i++) {
            if (i % 2 == 0) {
                Evencount++;
            } else
                Oddcount++;
        }
        System.out.println(Evencount);
        System.out.println(Oddcount);
    }
}

//class Q5{
//    public static void main(String[] args) {
//        for (int i=1;i<=10;i++){
//            int a=2*i;
//            System.out.println("2x"+i+"="+a);
//        }
//
//    }
//}
//class Q6{
//    public static void main(String[] args) {
//        int sum=0;
//        for (int i=1;i<=10;i++){
//            sum+=i;
//        }
//        System.out.println("sum="+sum);
//    }
//
//}

//class Q7{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter the positive num");
//        int n = scanner.nextInt();
//        for (int i=1;i<=10;i++){
//            int a=n*i;
//            System.out.println("nX"+"i"+"="+a);
//
//        }
//
//    }
//}
//
//class Q8{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the positive integer");
//        int n=scanner.nextInt();
//        int num=n/2;
//        for (int i=2;i<num;i++) {
//            if (n % 2 == 0) {
//                System.out.println("not a prime num");
//                break;
//            }
//        }
//          else (num==0){
//              System.out.println("prime num");
//        }
//    }
//}

class Q9{
    public static void main(String[] args) {
        
    }
}