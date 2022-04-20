package Day2;

import javax.swing.*;

public class Q12 {
    public static void main(String[] args) {
        int x,y;
        x=Integer.parseInt(JOptionPane.showInputDialog("enter the num"));
        y=Integer.parseInt(JOptionPane.showInputDialog("enter the num"));
        JOptionPane.showMessageDialog(null,(x<y)&&(x<50));
    }
}
