package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TableLayout;
import com.example.lof.views.KarakterValasztView;

public class KarakterValasztasActivity extends AppCompatActivity {

    ImageButton btn_yoshi = findViewById(R.id.btn_yoshi);
    ImageButton btn_ameyuki = findViewById(R.id.btn_yoshi);
    ImageButton btn_yoshi = findViewById(R.id.btn_yoshi);
    ImageButton btn_yoshi = findViewById(R.id.btn_yoshi);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karakter_valasztas);
        TableLayout table = findViewById(R.id.karaktertable);
        KarakterValasztView.TablaFeltolt(table);
    }
}
