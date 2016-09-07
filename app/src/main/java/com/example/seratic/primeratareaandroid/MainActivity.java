package com.example.seratic.primeratareaandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    ImageView imcolor;
    CheckBox chAmarillo,chAzul,chRojo;
    RadioButton rbAmarillo, rbAzul, rbRojo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imcolor = (ImageView) findViewById(R.id.imagenColor);
        chAmarillo = (CheckBox) findViewById(R.id.chAmarillo);
        chAzul = (CheckBox) findViewById(R.id.chAzul);
        chRojo = (CheckBox) findViewById(R.id.chRojo);
        chAmarillo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                clearRB();
                changeColorImagen();
            }
        });

        chAzul.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                clearRB();
                changeColorImagen();
            }
        });

        chRojo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                clearRB();
                changeColorImagen();
                        }
        });
        rbAmarillo= (RadioButton) findViewById(R.id.rbamarillo);
        rbAzul= (RadioButton) findViewById(R.id.rbazul);
        rbRojo= (RadioButton) findViewById(R.id.rbrojo);
        rbAmarillo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                rbAzul.setChecked(false);
                rbRojo.setChecked(false);
                clearCH();
                ChangeColorChanged();
            }
        });
        rbAzul.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                rbAmarillo.setChecked(false);
                rbRojo.setChecked(false);
                clearCH();
                ChangeColorChanged();
            }
        });
        rbRojo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                rbAmarillo.setChecked(false);
                rbAzul.setChecked(false);
                clearCH();
                ChangeColorChanged();
            }
        });

    }

    private void changeColorImagen(){
        if(chAmarillo.isChecked() && chAzul.isChecked()&& chRojo.isChecked()){
            imcolor.setBackgroundColor(Color.parseColor("#606060"));
        }else if(chAmarillo.isChecked() && chAzul.isChecked()){
            imcolor.setBackgroundColor(Color.parseColor("#00CC00"));
        }else if(chAmarillo.isChecked() && chRojo.isChecked()){
            imcolor.setBackgroundColor(Color.parseColor("#F2892E"));
        }else if (chAzul.isChecked()&& chRojo.isChecked()){
            imcolor.setBackgroundColor(Color.parseColor("#990099"));
        }
        else {
            if (chAmarillo.isChecked()) {
                imcolor.setBackgroundColor(Color.YELLOW);
            }
            else if (chAzul.isChecked()) {
                imcolor.setBackgroundColor(Color.BLUE);
            }
            else if (chRojo.isChecked()) {
                imcolor.setBackgroundColor(Color.RED);
            }
        }

    }

    private void ChangeColorChanged(){

        if(rbAmarillo.isChecked()){
           imcolor.setBackgroundColor(Color.YELLOW);
                    }
        if(rbAzul.isChecked()){
           imcolor.setBackgroundColor(Color.BLUE);
        }
        if(rbRojo.isChecked()){
            imcolor.setBackgroundColor(Color.RED);
        }
    }

    private void clearCH(){
        chAmarillo.setChecked(false);
        chAzul.setChecked(false);
        chRojo.setChecked(false);
        imcolor.setBackgroundColor(Color.TRANSPARENT);
    }
    private void clearRB(){
        rbAmarillo.setChecked(false);
        rbAzul.setChecked(false);
        rbRojo.setChecked(false);
        imcolor.setBackgroundColor(Color.TRANSPARENT);
    }
    }
