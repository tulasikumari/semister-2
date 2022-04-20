package Day2;

import javax.swing.*;

public class Q13 {
    public static void main(String[] args) {
        int f,s,t,p,T;
        f=Integer.parseInt(JOptionPane.showInputDialog("enter the math mark"));
        s=Integer.parseInt((JOptionPane.showInputDialog("enter the nep mark")));
        t=Integer.parseInt(JOptionPane.showInputDialog("enter the social mark"));
        T=f+s+t;
        p=T/3;
        JOptionPane.showMessageDialog(null,"total marks"+T+"\npercentage:"+p);

    }
}
