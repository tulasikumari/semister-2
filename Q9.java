import javax.swing.*;

public class Q9 {
    public static void main(String[] args) {
        int P,R,T,SI;
        P=Integer.parseInt(JOptionPane.showInputDialog("enter the principal"));
        R=Integer.parseInt(JOptionPane.showInputDialog("enter the rate"));
        T=Integer.parseInt((JOptionPane.showInputDialog("enter the time")));
        SI=(P*T*R)/100;
        JOptionPane.showMessageDialog(null,"SI:"+SI);

    }
}
