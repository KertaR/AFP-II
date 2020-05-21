package com.example.lof;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Win extends AppCompatActivity {
    TextView XP = findViewById(R.id.textView18);
    TextView GOLD = findViewById(R.id.textView47);

    @Override
    protected void onCreate(Bundle savedInstanceSaved){
        super.onCreate(savedInstanceSaved);
        setContentView(R.layout.win);
        Button Kezdolap = findViewById(R.id.button42);
        Kezdolap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View kezdolap) {
                openPlayerMenu();
            }
        });
    }

    public void openPlayerMenu(){
        Intent player_menu = new Intent(this, PlayerMenu.class);
        startActivity(player_menu);
    }

    public void setXPAndGold(int xp, int gold){
        XP.setText("Kapott XP: " + String.valueOf((int)xp));
        GOLD.setText("Kapott gold: " + String.valueOf((int)gold));
    }
}
