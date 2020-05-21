package com.example.lof;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Defeat extends AppCompatActivity {
    TextView XP = findViewById(R.id.textView49);

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.defeat);
        Button Kezdolap = findViewById(R.id.button35);
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

    public void setXP(int xp){
        XP.setText("Kapott XP: " + String.valueOf((xp)));
    }
}
