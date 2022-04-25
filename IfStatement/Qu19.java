package IfStatement;

import java.util.Scanner;

public class Qu19 {
    public class Q19 {
        public static void main(String[] args) {
            Scanner demo = new Scanner(System.in);
            int maths, physics, computer, chemistry, biology, total;
            double percentage;
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
            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 80) {
                grade = "B";
            } else if (percentage >= 70) {
                grade = "C";
            } else if (percentage >= 60) {
                grade = "D";
            } else if (percentage >= 40) {
                grade = "E";
            } else {
                grade = "F";
            }
            System.out.println("Percentage: " + percentage + "%\nGrade: " + grade);
        }
    }
}
