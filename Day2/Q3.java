package Day2;

import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        int F,S,T,Fth,Total;
        double percentage;
        String result;
        F= Integer.parseInt(JOptionPane.showInputDialog("enter 1st marks"));
        S= Integer.parseInt(JOptionPane.showInputDialog("enter 2st marks"));
        T= Integer.parseInt(JOptionPane.showInputDialog("enter 3st marks"));
        Fth= Integer.parseInt(JOptionPane.showInputDialog("enter 4st marks"));
        Total=F+S+T+Fth;
        percentage=Total/4;
        result=percentage>69?"First Class":percentage>59? "Upper Second class":percentage>49?" Second Class":percentage>39?"Third Class":"fail";
        JOptionPane.showMessageDialog(null,"Total"+Total+"\npercentage:"+percentage+"%"+ "\n result:"+result);


    }
}
