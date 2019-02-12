package com.example.rgbselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ColorSetter color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color = new ColorSetter();

        final TextView output = findViewById(R.id.output);

        SeekBar red = findViewById(R.id.seek_red);
        SeekBar green = findViewById(R.id.seek_green);
        SeekBar blue = findViewById(R.id.seek_blue);


        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int red_value = seekBar.getProgress();
                color.addValue(red_value, 'r');
                output.setBackgroundColor(color.getRGB());
                output.setText(color.getHex());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "successfully added red", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int green_value = seekBar.getProgress();
                color.addValue(green_value, 'g');
                output.setBackgroundColor(color.getRGB());
                output.setText(color.getHex());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "successfully added green", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int blue_value = seekBar.getProgress();
                color.addValue(blue_value, 'b');
                output.setBackgroundColor(color.getRGB());
                output.setText(color.getHex());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "successfully added blue", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        if(color.getHex().compareTo("#808080") >= 0) {
            output.setTextColor(Color.rgb(255, 255, 255));
        }
    }
}
