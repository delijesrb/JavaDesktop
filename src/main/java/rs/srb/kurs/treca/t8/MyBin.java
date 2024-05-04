package rs.srb.kurs.treca.t8;

import rs.srb.kurs.treca.t7.MyList;

import javax.swing.*;
import java.awt.*;

public class MyBin extends JFrame {
    private JPanel myPanel;
    private Totallizer totallizer1;


    public MyBin()  {
        this.setContentPane(myPanel);
        totallizer1.setBackground(Color.RED);
    }

    public static void main(String[] args) {
    JFrame f = new MyBin();
    f.pack();
    f.setMinimumSize(new Dimension(200, 200));
    f.setLayout(new FlowLayout());



    f.setVisible(true);
}

    private void createUIComponents() {
        totallizer1=new Totallizer();// TODO: place custom component creation code here
    }
}
