package com.example.lof;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Win extends AppCompatActivity {
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
}
