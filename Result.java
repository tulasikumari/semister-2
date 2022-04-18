//public class Result {
//    public static void main(String[] args) {
//        float TotalMarks, Sub1, Sub2, Sub3, Sub4;
//        Sub1 = 50;
//        Sub2 = 70;
//        Sub3 = 60;
//        Sub4 = 90;
//        TotalMarks = (Sub1 + Sub2 + Sub3 + Sub4) / 4;
//        System.out.println(TotalMarks);
//        System.out.println(TotalMarks);
//    }
//}

import javax.swing.*;

public class Result {
    public static void main(String[] args) {
        double eng = Double.parseDouble(JOptionPane.showInputDialog("Enter the marks of math"));
        double nep = Double.parseDouble(JOptionPane.showInputDialog("Enter the marks of nep"));
        double social = Double.parseDouble(JOptionPane.showInputDialog("Enter the marks of social"));
        double eph = Double.parseDouble(JOptionPane.showInputDialog("Enter the marks of eph"));
        double total, percentage;
        total = eng + nep + social + eph;
        percentage = (total / 4);
        int castedpercentage = (int) (percentage);
        JOptionPane.showMessageDialog(null, castedpercentage + "%");

    }
}

