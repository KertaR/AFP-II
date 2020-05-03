package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Button bolt = findViewById(R.id.button27);
        bolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bolt) {
                startActivity(new Intent(GameActivity.this,PopGame.class));
            }
        });
    }

}
