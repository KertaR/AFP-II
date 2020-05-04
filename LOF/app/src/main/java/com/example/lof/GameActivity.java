package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lof.datastructures.Champions.Ameyuki_hercegno;
import com.example.lof.datastructures.Champions.Sakusa;
import com.example.lof.datastructures.Champions.Shizuki;
import com.example.lof.datastructures.Champions.Yoshi;
import com.example.lof.datastructures.Character;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    Character player,enemy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Intent intent = getIntent();
        boolean korvege = false;
        String karakternev = intent.getStringExtra("karakter");
        JatekInicalizalasa(karakternev);
        Button bolt = findViewById(R.id.button27);
        bolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bolt) {
                startActivity(new Intent(GameActivity.this,PopGame.class));
            }
        });

    }
    private void JatekInicalizalasa(String karakternev){
        Character character = null;
        switch (karakternev){
            case "Ameyuki": character = new Ameyuki_hercegno();
            break;
            case "Yoshi": character = new Yoshi();
                break;
            case "Sakusa": character = new Sakusa();
                break;
            case "Shizuki": character = new Shizuki();
                break;
        }
        player = character;
        Random rnd = new Random();
        int random = rnd.nextInt(100);
        if(random >= 0 && random <= 25) enemy = new Ameyuki_hercegno();
        else if(random > 25 && random <= 50 ) enemy = new Yoshi();
        else if(random > 50 && random <= 75 ) enemy = new Sakusa();
        else if(random > 75 && random <= 100 ) enemy = new Shizuki();

    }
}
