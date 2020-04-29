package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lof.controllers.UserHandler;
import com.example.lof.database.AppDatabase;
import com.example.lof.datastructures.User;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserHandler.setUserHandler(getApplicationContext());
        Button Elfogad = findViewById(R.id.button);
        Elfogad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View elfogad) {
                EditText felhasznalonev = findViewById(R.id.editText);
                EditText jelszo = findViewById(R.id.editText2);
                if(UserHandler.Login(felhasznalonev.getText().toString(),jelszo.getText().toString()))
                openElfogad();
                else{
                    Toast.makeText(getApplicationContext(),"Hibás felhasználónév, vagy jelszó.", Toast.LENGTH_SHORT).show();
                }
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
            public void onClick(View creator) {
                openCreatorActivity();
            }
        });

        Button Jogi_nyilatkozat = findViewById(R.id.button11);
        Jogi_nyilatkozat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View legalnotice) {
                openLegalNoticeActivity();
            }
        });
    }

    public void openElfogad(){
        Intent player_menu = new Intent(this,FragmentNavigationView.class);
        startActivity(player_menu);
    }

    public void openRegistrationActivity(){
        Intent registration = new Intent(this, RegistrationActivity.class);
        startActivity(registration);
    }

    public void openTermsOfUseActivity(){
        Intent termsofuse = new Intent(this,TermsOfUseActivity.class);
        startActivity(termsofuse);
    }

    public void openCreatorActivity(){
        Intent creator = new Intent(this,CreatorActivity.class);
        startActivity(creator);
    }

    public void openLegalNoticeActivity(){
        Intent legalnoticeactivity = new Intent(this,LegalNoticeActivity.class);
        startActivity(legalnoticeactivity);
    }


}
