package rs.srb.kurs.prva.prva2;

import rs.srb.kurs.prva.prva1.MyFrame;

import java.awt.*;

public class GridL {
    public static void main(String[] args) {
        Frame f = new Frame();

        Button b = new Button("t");
        f.add(b, BorderLayout.PAGE_START);

        Button b1 = new Button("s");
        f.add(b1,BorderLayout.CENTER);

        f.setSize(640,480);
        f.setVisible(true);

        MyFrame frame = new MyFrame("SRki");

        Button B1 = new Button("TOP");
        Button B2 = new Button("Center");
        Button B3 = new Button("Botton");
        Button B4 = new Button("Left");
        Button B5 = new Button("Right");
        Button B6 = new Button("R");
        Button B7 = new Button("L");
        Button B8 = new Button("C");
        Button B9 = new Button("S");


        frame.add(B1,BorderLayout.PAGE_START);
        frame.add(B2,BorderLayout.CENTER);
        frame.add(B3,BorderLayout.PAGE_END);
        frame.add(B4,BorderLayout.LINE_START);
        frame.add(B5,BorderLayout.LINE_END);
        frame.add(B6,BorderLayout.AFTER_LAST_LINE);
        frame.add(B7,BorderLayout.AFTER_LINE_ENDS);
        frame.add(B8,BorderLayout.EAST);
        frame.add(B9,BorderLayout.WEST);


        frame.start();

    }
}
