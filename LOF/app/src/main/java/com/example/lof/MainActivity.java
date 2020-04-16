package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.annotation.Documented;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Elfogad = findViewById(R.id.button);
        Elfogad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_player_menu);
            }
        });

        Button Regisztráció = findViewById(R.id.button7);
        Regisztráció.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.activity_registration);
            }
        });

        Button Vissza = findViewById(R.id.button16);
        Vissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

        Button Felhasznalai_feltetelek = findViewById(R.id.button9);
        Felhasznalai_feltetelek.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.activity_terms_of_use);
            }
        });

        Button Az_alkotókról = findViewById(R.id.button10);
        Az_alkotókról.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_creator);
            }
        });

        Button Jogi_nyilatkozat = findViewById(R.id.button11);
        Jogi_nyilatkozat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_legal_notice);
            }
        });
    }

}
