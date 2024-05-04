package rs.srb.emir.two;

import rs.srb.emir.two.image.IconLoader;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;


public class GeekPanel extends JPanel {

    private ChekBoxPanel chekBoxPanel;
    private JLabel imageLabel;
    private StringBuffer imageName = new StringBuffer("cght");
    private final IconLoader iconLoader = new IconLoader(GeekPanel.class);

    public GeekPanel() {


        setLayout(new BorderLayout());

        imageLabel = new JLabel(); // Inicijalizacija imageLabel-a
        chekBoxPanel = new ChekBoxPanel( this::updateImageLabel);


        updateImageLabel(new ChangeModel());

        add(chekBoxPanel, BorderLayout.LINE_START);
        add(imageLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

    }


    private void updateImageLabel( ChangeModel changeModel) {
        imageName.setCharAt(changeModel.getIndex(), changeModel.getSlovo());
        String prefiks = "geek/geek-";
        String name = imageName.toString();
        String sufix = ".gif";
        String imageName =String.format("%s%s%s",prefiks,name,sufix);

        Icon icon =  iconLoader.loadIcon(imageName);

        imageLabel.setIcon(icon);
    }


}