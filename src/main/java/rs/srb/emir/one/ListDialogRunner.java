package rs.srb.emir.one;

import javax.swing.*;

public class ListDialogRunner {
    public static void main(String[] args) {
         Runnable runnable = ListDialogRunner::GUI;
        SwingUtilities.invokeLater(runnable);
    }
    static void GUI(){

        JFrame f = new JFrame("Select one in the list");
        NameChooserPanel lp = new NameChooserPanel();
        f.add(lp);
        f.pack();
        f.setVisible(true);



    }
}
