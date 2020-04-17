package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermsOfUseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_of_use);

        Button Felhasználási_feltetelek=findViewById(R.id.button9);
        Felhasználási_feltetelek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_terms_of_use);
            }
        });

        Button Az_alkotokrol=findViewById(R.id.button10);
        Az_alkotokrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_creator);
            }
        });

        Button Jogi_nyilatkozat=findViewById(R.id.button11);
        Jogi_nyilatkozat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_legal_notice);
            }
        });

        Button Vissza=findViewById(R.id.button16);
        Vissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });
    }
}
