package Day2;

import javax.swing.*;

public class Q6 {
    public static void main(String[] args) {
        double l,b,area;
        l=Double.parseDouble(JOptionPane.showInputDialog("enter the length"));
        b=Double.parseDouble(JOptionPane.showInputDialog("enter the breath"));
        area=l*b;
//        JOptionPane.showMessageDialog(null,"area"+area);
        int castedarea=(int)(area);
        JOptionPane.showMessageDialog(null,castedarea);
    }
}
