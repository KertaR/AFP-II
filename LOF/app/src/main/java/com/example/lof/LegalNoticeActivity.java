package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LegalNoticeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal_notice);

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
