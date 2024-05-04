package rs.srb.kurs.treca.t8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Totallizer extends JComponent {
    private  JTextField a;
    private  JTextField b;
    private  JTextField c;
    private JButton add;
    private JLabel addSing;
    private JLabel equalSing;
    private Color background;

    public JTextField getA() {
        return a;
    }

    public void setA(JTextField a) {
        this.a = a;
    }

    public JTextField getB() {
        return b;
    }

    public void setB(JTextField b) {
        this.b = b;
    }

    public JTextField getC() {
        return c;
    }

    public void setC(JTextField c) {
        this.c = c;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public JLabel getAddSing() {
        return addSing;
    }

    public void setAddSing(JLabel addSing) {
        this.addSing = addSing;
    }

    public JLabel getEqualSing() {
        return equalSing;
    }

    public void setEqualSing(JLabel equalSing) {
        this.equalSing = equalSing;
    }

    @Override
    public Color getBackground() {
        return background;
    }

    @Override
    public void setBackground(Color background) {
        this.background = background;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(background);
        g.fillRect(0,0,200,100);
    }

    public Totallizer() {
        this.setLayout(new FlowLayout());
        a=new JTextField(2);
        b=new JTextField(2);
        c=new JTextField(2);
        add= new JButton("Add");
        addSing=new JLabel("+");
        equalSing=new JLabel("=");

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer res = Integer.parseInt(a.getText())+Integer.parseInt(b.getText());
                c.setText(res.toString());
            }
        });
        this.add(a);
        this.add(addSing);
        this.add(b);
        this.add(equalSing);
        this.add(c);
        this.add(add);
        this.background = Color.BLUE;



    }
}
