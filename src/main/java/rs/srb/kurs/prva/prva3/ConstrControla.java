package rs.srb.kurs.prva.prva3;

import rs.srb.kurs.prva.prva1.MyFrame;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ConstrControla {
    public static void main(String[] args) {

        MyFrame f = new MyFrame("f");
    f.setLayout(new FlowLayout());
    TextField tf = new TextField();
    TextArea ta = new TextArea(5,10);
    f.add(tf);
    f.add(ta);

    tf.setText("upisi naslov");
    ta.setText("upisi text");

    tf.addTextListener(new TextListener() {
        @Override
        public void textValueChanged(TextEvent e) {
            TextField tf =(TextField) e.getSource();
            System.out.println(tf.getText());
        }
    });
    f.start();
}
}
