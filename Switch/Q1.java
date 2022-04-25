package Switch;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int maths, physics, computer, chemistry, biology, total, percentage, avg;
        String grade;
        System.out.print("Enter the marks secured in Maths ");
        maths = demo.nextInt();
        System.out.print("Enter the marks secured in Physics ");
        physics = demo.nextInt();
        System.out.print("Enter the marks secured in Chemistry ");
        chemistry = demo.nextInt();
        System.out.print("Enter the marks secured in Biology ");
        biology = demo.nextInt();
        System.out.print("Enter the marks secured in Computer ");
        computer = demo.nextInt();
        total = maths + physics + chemistry + computer + biology;
        percentage = total / 5;
        avg = percentage / 10;
        switch (avg) {
            case 10:
                grade = "A";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 4:
                grade = "E";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println("Percentage: " + percentage + "%\nGrade: " + grade);
    }
}
