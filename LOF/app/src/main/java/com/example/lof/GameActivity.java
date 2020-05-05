package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.lof.controllers.Csata;
import com.example.lof.datastructures.Champions.Ameyuki_hercegno;
import com.example.lof.datastructures.Champions.Sakusa;
import com.example.lof.datastructures.Champions.Shizuki;
import com.example.lof.datastructures.Champions.Yoshi;
import com.example.lof.datastructures.Character;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    Character player,enemy;
    boolean kiaz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Intent intent = getIntent();
        boolean korvege = false;
        String karakternev = intent.getStringExtra("karakter");
        kiaz = Csata.Sorsol();
        JatekInicalizalasa(karakternev);
        ImageButton attack = findViewById(R.id.btn_attack);
        ImageButton skill1 = findViewById(R.id.btn_skill1);
        ImageButton skill2 = findViewById(R.id.btn_skill2);
        ImageButton skill3 = findViewById(R.id.btn_skill3);
        ImageButton skill4 = findViewById(R.id.btn_skill4);
        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View attack) {
                player.Attack(player,enemy);
            }
        });
        skill1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View skill1) {
                player.PrimarySkill(enemy);
            }
        });
        skill2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View skill2) {
                player.SecondarySkill(enemy);
            }
        });
        skill3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View skill3) {
                player.TertiarySkillSkill(enemy);
            }
        });
        skill4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View skill4) {
                player.QuaternarySkill(enemy);
            }
        });

    }
    private void JatekInicalizalasa(String karakternev){
        Character character = null;
        switch (karakternev){
            case "Ameyuki":
            {
                character = null;
                character = new Ameyuki_hercegno();
            }
            break;
            case "Yoshi":
            {
                character = null;
                character = new Yoshi();
            }
            break;
            case "Sakusa":
            {
                character = null;
                character = new Sakusa();
            }
            break;
            case "Shizuki": {
                character = null;
                character = new Shizuki();
            }
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
