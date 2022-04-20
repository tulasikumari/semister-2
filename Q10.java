import javax.swing.*;

public class Q10 {
    public static void main(String[] args) {
        String name,last;
        name= JOptionPane.showInputDialog("enter the name:");
        last=JOptionPane.showInputDialog("enter the last:");
        JOptionPane.showMessageDialog(null,"name:"+name+ "\nlast:"+last);
        JOptionPane.showMessageDialog(null,name+" "+last);
    }
}
