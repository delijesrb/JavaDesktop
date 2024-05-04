package rs.srb.kurs.druga.druga3;

import javax.swing.*;

public class myForm extends JFrame{
    private JPanel meinPanel;

    public myForm( ) {
        this.setContentPane(meinPanel);
    }

    public static void main(String[] args) {

        myForm m = new myForm();
        m.setSize(400,300);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // m.setLayout(new BoxLayout(m.meinPanel, BoxLayout.PAGE_AXIS));
        m.setLayout(null);
       GroupLayout gp = new GroupLayout(m.meinPanel);
        m.setLayout(gp);
        m.meinPanel.setLayout(gp);


        JButton b1 = new JButton("Brazil");
     /*   JButton b2 = new JButton("Bugarska");
        JButton b3 = new JButton("Bolivija");
        JButton b4 = new JButton("Burkina faso");

      gp.setAutoCreateGaps(true);
        gp.setAutoCreateContainerGaps(true);

        gp.setHorizontalGroup(gp.createSequentialGroup()
                .addComponent(b1)
                .addComponent(b2)
                .addGroup(gp.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(b3)
                        .addComponent(b4)));

        gp.setVerticalGroup(gp.createSequentialGroup()
                .addGroup(gp.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(b1)
                        .addComponent(b2)
                        .addComponent(b3))
                .addComponent(b4));

      */


        SpringLayout sp = new SpringLayout();
        m.setLayout(sp);
        sp.putConstraint(SpringLayout.WEST,b1,50,SpringLayout.WEST,m);
        sp.putConstraint(SpringLayout.SOUTH,b1,100,SpringLayout.SOUTH,m);

        System.out.println(m.getLayeredPane());
        System.out.println(m.getLayout());

        m.add(b1);

        m.setVisible(true);


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
