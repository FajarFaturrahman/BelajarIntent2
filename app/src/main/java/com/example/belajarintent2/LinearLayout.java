package com.example.belajarintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayout extends AppCompatActivity implements View.OnClickListener {

    Button daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        daftar = findViewById(R.id.daftar);
        daftar.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        Intent daftar = new Intent(LinearLayout.this, MainActivity.class);
        startActivity(daftar);
    }
}
