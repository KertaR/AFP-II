package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lof.controllers.UserHandler;

public class RegistrationActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button register = (Button) findViewById(R.id.button12);
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText felhasznalonev = (EditText) findViewById(R.id.editText5);
                EditText jelszo = (EditText) findViewById(R.id.editText3);
                EditText jelszoconf = (EditText) findViewById(R.id.editText4);
                UserHandler.Register(getApplicationContext(),felhasznalonev.getText().toString(),jelszo.getText().toString(),jelszoconf.getText().toString());
            }
        });

        Button Felhasznalasi_feltetelek = findViewById(R.id.button9);
        Felhasznalasi_feltetelek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View termsofuse) {
                openTermsOfUseActivity();
            }
        });

        Button Az_alkotokrol = findViewById(R.id.button10);
        Az_alkotokrol.setOnClickListener(new View.OnClickListener() {
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

        Button Vissza = findViewById(R.id.button16);
        Vissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vissza) {
                openMainActivity();
            }
        });
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
        Intent legalnotice = new Intent(this,LegalNoticeActivity.class);
        startActivity(legalnotice);
    }

    public void openMainActivity(){
        Intent vissza = new Intent(this,MainActivity.class);
        startActivity(vissza);
    }
}
