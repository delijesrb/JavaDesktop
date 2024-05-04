package rs.srb.emir.five;

import java.awt.*;

public class ColorConverter {
    public Color toColor(String color){
        String []rgb = color.split(",");
        int red = Integer.parseInt(rgb[0]);
        int green = Integer.parseInt(rgb[1]);
        int blue = Integer.parseInt(rgb[2]);
        Color colorObject =  new Color(red,green,blue);
        return colorObject;
    }
    public String toColorString (Color color){
        String colorValue = color.getRed()+","+color.getGreen()+","+color.getBlue();
        return colorValue;
    }
}
