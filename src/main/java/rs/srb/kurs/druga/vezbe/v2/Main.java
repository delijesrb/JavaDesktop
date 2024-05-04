package rs.srb.kurs.druga.vezbe.v2;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private JPanel mainPanel;
    private JEditorPane editorPane1;
    private JTable table1;
    private JList list1;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JCheckBox checkBox1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button4;

    public Main()  {
        this.setContentPane(mainPanel);
    }

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(800,640);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        f.setLayout(new BorderLayout());

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.LINE_AXIS));
        String[] buttons = {"Restart", "Stop Game", "Exit Program"};
        for(int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(buttons[i]);
            button.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
            menuPanel.add(button);
        }
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 4));

        for(int i = 1; i < 13; i++) {
            gamePanel.add(new JButton("Card #" + i));
        }
        f.add(menuPanel, BorderLayout.PAGE_START);
        f.add(gamePanel, BorderLayout.CENTER);
    }
}
