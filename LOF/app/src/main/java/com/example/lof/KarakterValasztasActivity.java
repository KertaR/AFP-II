package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.lof.datastructures.Champions.Ameyuki_hercegno;
import com.example.lof.datastructures.Champions.Sakusa;
import com.example.lof.datastructures.Champions.Shizuki;
import com.example.lof.datastructures.Champions.Yoshi;
import com.example.lof.datastructures.Character;
import com.example.lof.views.KarakterValasztView;

import java.util.List;

public class KarakterValasztasActivity extends AppCompatActivity {
    String kivalasztottkarakter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karakter_valasztas);
        ImageButton btn_yoshi = (ImageButton)this.findViewById(R.id.btn_yoshi);
        ImageButton btn_ameyuki = (ImageButton)this.findViewById(R.id.btn_ameyuki);
        ImageButton btn_shizuki = (ImageButton)this.findViewById(R.id.btn_shizuki);
        ImageButton btn_sakusa = (ImageButton)this.findViewById(R.id.btn_sakusa);
        Button btn_meccsinditas = (Button)this.findViewById(R.id.meccsinditas);
        btn_yoshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View yoshi) {
                kivalasztottkarakter = "Yoshi";
                ImageView img = (ImageView) findViewById(R.id.karaktervalasztas);
                img.setImageResource(R.drawable.leiras_yoshi);
            }
        });
        btn_ameyuki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ameyuki) {
                kivalasztottkarakter = "Ameyuki";
                ImageView img = (ImageView) findViewById(R.id.karaktervalasztas);
                img.setImageResource(R.drawable.leiras_ameyuki);
            }
        });
        btn_shizuki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View shizuki) {
                kivalasztottkarakter = "Shizuki";
                ImageView img = (ImageView) findViewById(R.id.karaktervalasztas);
                img.setImageResource(R.drawable.leiras_shizuki);
            }
        });
        btn_sakusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View sakusa) {
                kivalasztottkarakter = "Sakusa";
                ImageView img = (ImageView) findViewById(R.id.karaktervalasztas);
                img.setImageResource(R.drawable.leiras_sakusa);
            }
        });
        btn_meccsinditas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View game) {
                if(!kivalasztottkarakter.isEmpty()) {
                    Intent start = new Intent(getApplicationContext(), GameActivity.class);
                    start.putExtra("karakter", kivalasztottkarakter);
                    startActivity(start);
                }
                else Toast.makeText(getApplicationContext(), "Kérlek válassz egy karaktert!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
