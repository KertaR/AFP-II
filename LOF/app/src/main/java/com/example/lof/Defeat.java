package com.example.lof;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Defeat extends AppCompatActivity {
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
}
