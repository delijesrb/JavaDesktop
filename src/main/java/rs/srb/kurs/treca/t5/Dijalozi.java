package rs.srb.kurs.treca.t5;

import rs.srb.kurs.treca.t4.MyForm;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.io.File;
import java.util.Locale;

public class Dijalozi {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.pack();
        f.setMinimumSize(new Dimension(200,200));
        f.setLayout(new FlowLayout());
        //JOptionPane.showOptionDialog(null,"Do you agree","question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new String[] {"Millenium falcon", "X-Wing", "A-Wing", "B-Wing", "Y-Wing", "Imperial battlecruiser"},null);

 /*       Color backgroundColor = JColorChooser.showDialog(null,"choose color",Color.RED);

        if (backgroundColor != null){
            f.getContentPane().setBackground(backgroundColor);
        }


  */
        JFileChooser jfc = new JFileChooser();
        //jfc.showOpenDialog(null);

        // int response = jfc.showSaveDialog(null);
/*
        switch (response){
            case JFileChooser.CANCEL_OPTION : break;

              default: JOptionPane.showMessageDialog(null,jfc.getSelectedFile().getPath());
        }


 */
        jfc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()){
                    return true;
                }
                String fn = f.getName();
                String e = "";
                int i = fn.lastIndexOf('.');
                if (i>0 && i<fn.length() -1){
                    e = fn.substring(i+1).toLowerCase();
                }
                return e.equals("png");
            }


            @Override
            public String getDescription() {
                return "png";
            }
        });
        jfc.showOpenDialog(null);
        f.setVisible(true);
    }
}
