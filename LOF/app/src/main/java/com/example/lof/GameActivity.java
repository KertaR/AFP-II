package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

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
    int gold;
    double health;
    double mana;
    double manaenemy;
    double healthenemy;
    TextView enemyhealth;
    TextView enemymana;
    ImageView enemypicture;
    TextView selfhealth;
    TextView selfmana;
    TextView selfgold;
    ImageView selfpicture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Intent intent = getIntent();
        enemyhealth = findViewById(R.id.enemyhealth);
        enemymana = findViewById(R.id.enemymana);
        enemypicture = findViewById(R.id.enemypicture);
        selfhealth = findViewById(R.id.selfhealth);
        selfmana = findViewById(R.id.selfmana);
        selfgold = findViewById(R.id.selfgold);
        selfpicture = findViewById(R.id.selfpicture);
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
                enemy.Bot(enemy,player);
                player.EndRound();
                enemy.EndRound();
                CurrentStatus();
            }
        });
        skill1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View skill1) {
                player.PrimarySkill(enemy);
                enemy.Bot(enemy,player);
                player.EndRound();
                enemy.EndRound();
                CurrentStatus();
            }
        });
        skill2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View skill2) {
                player.SecondarySkill(enemy);
                enemy.Bot(enemy,player);
                player.EndRound();
                enemy.EndRound();
                CurrentStatus();
            }
        });
        skill3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View skill3) {
                player.TertiarySkill(enemy);
                enemy.Bot(enemy,player);
                player.EndRound();
                enemy.EndRound();
                CurrentStatus();
            }
        });
        skill4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View skill4) {
                player.QuaternarySkill(enemy);
                enemy.Bot(enemy,player);
                player.EndRound();
                enemy.EndRound();
                CurrentStatus();
            }
        });

    }
    @SuppressLint("ResourceType")
    private void JatekInicalizalasa(String karakternev){
        Character character = null;
        switch (karakternev){
            case "Ameyuki":
            {
                character = null;
                character = new Ameyuki_hercegno();
                selfpicture.setImageResource(R.drawable.ameyuki_profil);
            }
            break;
            case "Yoshi":
            {
                character = null;
                character = new Yoshi();
                selfpicture.setImageResource(R.drawable.yoshi_profil);
            }
            break;
            case "Sakusa":
            {
                character = null;
                character = new Sakusa();
                selfpicture.setImageResource(R.drawable.sakusa);
            }
            break;
            case "Shizuki": {
                character = null;
                character = new Shizuki();
                selfpicture.setImageResource(R.drawable.shizuki_profil);
            }
            break;
        }
        player = character;
        gold=100;
        Random rnd = new Random();
        int random = rnd.nextInt(100);
        if(random >= 0 && random <= 25){
            enemy = new Ameyuki_hercegno();
            enemypicture.setImageResource(R.drawable.ameyuki_profil);
        }
        else if(random > 25 && random <= 50 ){
            enemy = new Yoshi();
            enemypicture.setImageResource(R.drawable.yoshi_profil);
        }
        else if(random > 50 && random <= 75 ){
            enemy = new Sakusa();
            enemypicture.setImageResource(R.drawable.sakusa);
        }
        else if(random > 75 && random <= 100 ){
            enemy = new Shizuki();
            enemypicture.setImageResource(R.drawable.shizuki_profil);
        }
        CurrentStatus();
    }
    public void CurrentStatus()
    {
        selfgold.setText(String.valueOf(gold));
        selfhealth.setText(String.valueOf((int)player.getHealthpoints()));
        selfmana.setText(String.valueOf((int)player.getMana()));
        enemyhealth.setText(String.valueOf((int)enemy.getHealthpoints()));
        enemymana.setText(String.valueOf((int)enemy.getMana()));
    }
}
