package rs.srb.kurs.treca.t3;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;

public class MyFramale extends JFrame{
    private JPanel myPanel;
    private JEditorPane editorPane1;
    private JTextField textField1;
    private JButton button1;
    //  private JTextField tf1;
    //private JTextField tf2;

    public MyFramale()  {
        this.setContentPane(myPanel);
      /*  tf1.setText("srkidgfskkasjfhasklfal pdfsdjpods");
        tf1.setSelectionColor(Color.RED);
        tf1.setSelectedTextColor(Color.WHITE);

        Caret c = tf1.getCaret();
        c.setDot(10);
        c.setBlinkRate(10);
        c.setMagicCaretPosition(new Point(3,10));

        //tf1.setSelectionStart(1);
        //tf1.setSelectionEnd(3);

        tf1.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                tf2.setText(String.valueOf(c.getDot()));
            }
        });
      /*  tf1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                tf2.setText(tf1.getText());
            }
        });


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Character c : sreckoPasswordField.getPassword()){
                    JOptionPane.showMessageDialog(null,c);
                }
            }
        });  */
       /* someTextFormattedTextField.setFormatterFactory(new JFormattedTextField.AbstractFormatterFactory() {
            @Override
            public JFormattedTextField.AbstractFormatter getFormatter(JFormattedTextField tf) {
                try {
                    return new MaskFormatter("UU-##-UU");
                } catch (ParseException e) {
                    e.printStackTrace();return null;
                }
            }
        });

        */
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    editorPane1.setPage(new URL(textField1.getText()));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame f = new MyFramale();
        f.setSize(640, 480);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.pack();





        f.setVisible(true);



    }

}