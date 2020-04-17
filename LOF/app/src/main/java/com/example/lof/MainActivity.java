package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayerMenu();
            }
        });

        Button Regisztráció = findViewById(R.id.button7);
        Regisztráció.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View registration) {
                openRegistrationActivity();
            }
        });

        Button Felhasznalai_feltetelek = findViewById(R.id.button9);
        Felhasznalai_feltetelek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View termsofuse) {
                openTermsOfUseActivity();
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

    public void openRegistrationActivity(){
        Intent registration = new Intent(this, RegistrationActivity.class);
        startActivity(registration);
    }

    public void openTermsOfUseActivity(){
        Intent termsofuse = new Intent(this,TermsOfUseActivity.class);
        startActivity(termsofuse);
    }

    public void openPlayerMenu(){
        Intent player_menu = new Intent(this,PlayerMenu.class);
        startActivity(player_menu);
    }
}
