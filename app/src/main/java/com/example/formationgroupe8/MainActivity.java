package com.example.formationgroupe8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private Button btnShow, btnHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.img);
        btnShow = findViewById(R.id.btnShow);
        btnHide = findViewById(R.id.btnHide);

        btnShow.setOnClickListener(v -> {
            image.setVisibility(View.VISIBLE);
        });

        btnHide.setOnClickListener(v -> {
            image.setVisibility(View.INVISIBLE);
        });

    }
}