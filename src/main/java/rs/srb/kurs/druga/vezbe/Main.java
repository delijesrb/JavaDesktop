package rs.srb.kurs.druga.vezbe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

    private JPanel mainPanel;
    static JButton invisible;

    static void switchButtons(JButton clickedButton) {
        if(invisible.getLocation().x < (clickedButton.getLocation().x - clickedButton.getSize().width) ||
                invisible.getLocation().x > (clickedButton.getLocation().x + clickedButton.getSize().width) ||
                invisible.getLocation().y < (clickedButton.getLocation().y - clickedButton.getSize().height) ||
                invisible.getLocation().y > (clickedButton.getLocation().y + clickedButton.getSize().height) ||
                (invisible.getLocation().y != clickedButton.getLocation().y &&
                        invisible.getLocation().x != clickedButton.getLocation().x)) {
            return;
        }

        Point tmpLoc = clickedButton.getLocation();
        clickedButton.setLocation(invisible.getLocation());
        invisible.setLocation(tmpLoc);
    }

    public Main() {
        this.setContentPane(mainPanel);
    }

    public static void main(String[] args) {
        Main mainFrame = new Main();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setSize(310, 300);

        LayoutManager layOut = new GridLayout(3, 3);
        mainFrame.setLayout(layOut);

        JButton btn = new JButton();
        for(int i = 1; i < 13; i++) {
            btn = new JButton(String.valueOf(i));
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    switchButtons((JButton) e.getSource());
                }
            });
            mainFrame.add(btn);
        }
        btn.setVisible(false);
        invisible = btn;
    }

}