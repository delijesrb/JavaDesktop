package rs.srb.kurs.druga.druga1;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public Main(String title) throws HeadlessException {
        super(title);
    }

    void postavka(){
        this.setSize(640,480);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        // frame.setLocation(600,400);
        this.setLocationRelativeTo(null);


        JButton b = new JButton("to");
        this.add(b);

    }
    public static void main(String[] args) {
        Main m = new Main(" OVO JE PROGRAM");
        m.postavka();


    }
}
