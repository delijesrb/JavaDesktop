package rs.srb.kurs.prva.prva2;

import rs.srb.kurs.prva.prva1.MyFrame;

import java.awt.*;

public class GridBagLay {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("GBL");
        LayoutManager lm = new GridBagLayout();

        myFrame.setLayout(lm);

        Button b1 = new Button("S1");
        Button b2 = new Button("S2");
        Button b3 = new Button("S3");
        Button b4 = new Button("S4");
        Button b5 = new Button("S5");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        myFrame.add(b1,gbc);
        gbc = new GridBagConstraints();
        gbc.gridx=1;
        gbc.gridy=0;
        myFrame.add(b2,gbc);
         gbc = new GridBagConstraints();
        gbc.gridx=2;
        gbc.gridy=0;
        myFrame.add(b3,gbc);
         gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=3;
        gbc.fill = GridBagConstraints.BOTH;
        myFrame.add(b4,gbc);
         gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=3;
        myFrame.add(b5,gbc);



        myFrame.start();



    }
}
