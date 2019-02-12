package com.example.rgbselector;

import android.graphics.Color;

public class ColorSetter {
    private int RED;
    private int GREEN;
    private int BLUE;

    public ColorSetter() {
        RED = 0;
        GREEN = 0;
        BLUE = 0;
    }

    private void setRed(int red_value) {
        RED = red_value;
    }

    private void setGreen(int green_value) {
        GREEN = green_value;
    }

    private void setBlue(int blue_value) {
        BLUE = blue_value;
    }

    public void addValue(int value, char color) {
        switch(color) {
            case 'r':
                setRed(value);
                break;
            case 'g':
                setGreen(value);
                break;
            case 'b':
                setBlue(value);
                break;
            default:
                throw new RuntimeException("char unidentified");
        }
    }

    private int getRed() {
        return RED;
    }
    private int getGreen() {
        return GREEN;
    }

    private int getBlue() {
        return BLUE;
    }

    public int getRGB() {
        return Color.rgb(this.getRed(), this.getGreen(), this.getBlue());
    }

    public String getHex() {
        int red_value = this.getRed();
        int green_value = this.getGreen();
        int blue_value = this.getBlue();

        String hexRed = Integer.toHexString(red_value);
        String hexGreen = Integer.toHexString(green_value);
        String hexBlue = Integer.toHexString(blue_value);


        return "#"+ hexRed + hexGreen + hexBlue;
    }

}
