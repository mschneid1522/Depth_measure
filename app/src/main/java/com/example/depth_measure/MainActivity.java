package com.example.depth_measure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton instrBtn = findViewById(R.id.instrBtn);
        instrBtn.setOnClickListener(v -> openInstructions());

        ImageButton appBtn = findViewById(R.id.fishCalcBtn);
        appBtn.setOnClickListener(v -> openFishCalcApp());

        ImageButton creditsBtn = findViewById(R.id.infoBtn);
        creditsBtn.setOnClickListener(v -> openCredits());
    }

    public void openInstructions() {
        Intent intent = new Intent(this, instructionsScreen.class);
        startActivity(intent);
    }

    public void openFishCalcApp() {
        Intent intent = new Intent(this, calculateScreen.class);
        startActivity(intent);
    }

    public void openCredits() {
        Intent intent = new Intent(this, creditsScreen.class);
        startActivity(intent);
    }
}
