package rs.srb.kurs.prva_vezbe;

import java.awt.
        *;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaApplication8 {
    public static void main(String[] args) {
        LayoutManager headerLayout = new FlowLayout(FlowLayout.CENTER);

        CardLayout bodyLayout = new CardLayout();

        Panel headerPanel = new Panel();
        headerPanel.setBackground(Color.gray);

        Panel bodyPanel = new Panel();

        Panel bodyPanel1 = new Panel();
        bodyPanel1.setBackground(Color.DARK_GRAY);

        Panel bodyPanel2 = new Panel();
        bodyPanel2.setBackground(Color.lightGray);

        headerPanel.setLayout(headerLayout);
        bodyPanel.setLayout(bodyLayout);

        Button button = new Button("First page");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bodyLayout.show(bodyPanel, "firstPanel");
            }
        });

        Button button1 = new Button("Second page");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bodyLayout.show(bodyPanel, "secondPanel");
            }
        });

        headerPanel.add(button);
        headerPanel.add(button1);

        bodyPanel.add(bodyPanel1, "firstPanel");
        bodyPanel.add(bodyPanel2, "secondPanel");

        Frame f = new Frame();
        f.add(headerPanel, BorderLayout.PAGE_START);
        f.add(bodyPanel, BorderLayout.CENTER);

        f.setSize(600, 400);
        f.setVisible(true);
    }
}



