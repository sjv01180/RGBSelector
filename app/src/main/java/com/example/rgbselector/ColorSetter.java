package com.example.rgbselector;

/**
 * Created by Samuel Velasquez on 2/11/19
 */

import android.graphics.Color;

/**
 * Color Setter model for application
 */

public class ColorSetter {
    /*Red integer value for rgb coloring*/
    private int RED;
    /*Green integer value for rgb coloring*/
    private int GREEN;
    /*Blue integer value for rgb coloring*/
    private int BLUE;


    /**
     * Initializes the three color variables
     */
    public ColorSetter(int r, int g, int b) {
        RED = r;
        GREEN = g;
        BLUE = b;
    }

    /**
     * Sets the red rgb value to a specific integer
     * @param red_value the new red value for the rgb color scheme
     */
    private void setRed(int red_value) {
        RED = red_value;
    }


    /**
     * Sets the green rgb value to a specific integer
     * @param green_value the new green value for the rgb color scheme
     */
    private void setGreen(int green_value) {
        GREEN = green_value;
    }


    /**
     * Sets the blue rgb value to a specific integer
     * @param blue_value the new blue value for the rgb color scheme
     */
    private void setBlue(int blue_value) {
        BLUE = blue_value;
    }

    /**
     * Adds an integer value to a specific color in the rgb color scheme
     * @param value the new value for a color
     * @param color the color whose value will be replace with value
     */
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

    /**
     * Grabs the red rgb value from the ColorSetter class
     * @return the red integer value for the rgb color scheme
     */
    private int getRed() {
        return RED;
    }

    /**
     * Grabs the green rgb value from the ColorSetter class
     * @return the green integer value for the rgb color scheme
     */
    private int getGreen() {
        return GREEN;
    }

    /**
     * Grabs the blue rgb value from the ColorSetter class
     * @return the blue integer value for the rgb color scheme
     */
    private int getBlue() {
        return BLUE;
    }

    /**
     * Grabs the final color value based on the rgb color scheme
     * @return usable numeric color value for stylizing application
     */
    public int getRGB() {
        return Color.rgb(this.getRed(), this.getGreen(), this.getBlue());
    }

    /**
     * Grabs the hexadecimal value of the combination of RED, GREEN and BLUE
     * @return the hexadecimal string value of the rgb color scheme
     */
    public String getHex() {
        int red_value = this.getRed();
        int green_value = this.getGreen();
        int blue_value = this.getBlue();

        String hexRed = Integer.toHexString(red_value);
        String hexGreen = Integer.toHexString(green_value);
        String hexBlue = Integer.toHexString(blue_value);


        return "#"+ hexRed + hexGreen + hexBlue;
    }

    /**
     * Grabs the complimentary color value of initial rgb color scheme value
     * @return the inverse of the usable numeric color value or white numeric color value
     */
    public int getRGBInverse() {

        final int MAX_VALUE = 255;
        int iRED = MAX_VALUE - this.getRed();
        int iGREEN = MAX_VALUE - this.getGreen();
        int iBLUE = MAX_VALUE - this.getBlue();

        int inv_max = 150;
        int inv_min = 90;

        if((iRED <= inv_max && iRED >= inv_min) && (iGREEN <= inv_max && iGREEN >= inv_min) && (iBLUE <= inv_max && iBLUE >= inv_min)) {
            iRED = 255;
            iGREEN = 255;
            iBLUE = 255;
        }

        return Color.rgb(iRED, iGREEN, iBLUE);
    }

}
