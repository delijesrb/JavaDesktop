package rs.srb.emir.one;

import rs.srb.emir.one.listner.AngelListner;
import rs.srb.emir.one.listner.DevilListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class ButtonPanel extends JPanel {

    public static final String ISKLJUCI = "DISABLE";
    public static final String UKLJUCI = "ENABLE";
    private final JButton leftButton;
    private final JButton middleButton;
    private final JButton rightButton;
    public ButtonPanel() {
        ActionListener unirvesal = this::onButtonClik;

        Icon leftImageIcon = createIcon("right.gif");
        ImageIcon slika = new ImageIcon("C:\\java_programs\\Java_Desktop_Application_Development\\src\\main\\resources\\picachu.gif");
        leftButton = new JButton("Disable middle button",leftImageIcon);
        leftButton.setVerticalTextPosition(SwingConstants.CENTER);
        leftButton.setHorizontalTextPosition(SwingConstants.LEADING);
        leftButton.setMnemonic(KeyEvent.VK_LEFT);
        leftButton.addActionListener(unirvesal);
        leftButton.setActionCommand(ISKLJUCI);
        leftButton.setToolTipText("dugme za iskljucivanje");
        leftButton.setBackground(Color.RED);
      //  AngelListner a = new AngelListner();
        //DevilListner d = new DevilListner();
       // leftButton.addActionListener(a);



        middleButton = new JButton("Middle",slika);
        middleButton.setHorizontalTextPosition(SwingConstants.CENTER);
        middleButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        middleButton.setMnemonic(KeyEvent.VK_M);
        Icon right = createIcon("left.gif");
        middleButton.addActionListener(unirvesal);

        rightButton = new JButton("Enable middle button",right);
        rightButton.setHorizontalTextPosition(SwingConstants.TRAILING);
        rightButton.setVerticalTextPosition(SwingConstants.CENTER);
        rightButton.setMnemonic(KeyEvent.VK_RIGHT);
       // rightButton.addActionListener(d);

        rightButton.addActionListener(unirvesal);
        rightButton.setActionCommand(UKLJUCI);
        rightButton.setToolTipText("dugme za ukljucivanje");
        add(leftButton);
        add(middleButton);
        add(rightButton);
    }


    private void onButtonClik(ActionEvent actionEvent){
        String actionCommand = actionEvent.getActionCommand();
        switch (actionCommand){
            //case UKLJUCI -> middleButton.setEnabled(true);
            //case ISKLJUCI -> middleButton.setEnabled(true);
            case UKLJUCI -> {
                middleButton.setEnabled(true);
                leftButton.setEnabled(true);
                rightButton.setEnabled(false);
            }
            case ISKLJUCI -> {
                middleButton.setEnabled(false);
                leftButton.setEnabled(false);
                leftButton.setBackground(null);
                rightButton.setEnabled(true);
                System.out.println(rightButton.getBackground());
            }
        }
        /*if (actionCommand.equals(UKLJUCI)){
            middleButton.setEnabled(true);
        }if (actionCommand.equals(ISKLJUCI)){
            middleButton.setEnabled(false);
        }

         */

    }
    private Icon createIcon(String pictureName){
        ClassLoader classLoader = ButtonPanel.class.getClassLoader();

        URL imageAddress = classLoader.getResource(pictureName);

        if(imageAddress != null){
            ImageIcon imageIcon = new ImageIcon(imageAddress);
            return  imageIcon;
        }
            return null;

    }


}
