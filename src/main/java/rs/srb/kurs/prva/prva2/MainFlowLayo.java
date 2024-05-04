package rs.srb.kurs.prva.prva2;

import rs.srb.kurs.prva.prva1.MyFrame;

import java.awt.*;

public class MainFlowLayo {
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame("Srki");

        LayoutManager lm = new FlowLayout(FlowLayout.LEFT);
        myFrame.setLayout(lm);


        for (int i = 0; i < 6; i++) {
            Button button = new Button("B"+i);
            myFrame.add(button);

        }
        myFrame.start();
    }
}
