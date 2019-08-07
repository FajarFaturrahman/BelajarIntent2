package com.example.belajarintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wheater extends AppCompatActivity implements View.OnClickListener {

    Button pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheater);

        pindah = findViewById(R.id.pindah);
        pindah.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        Intent pindah = new Intent(Wheater.this, HelloWorld.class);
        startActivity(pindah);
    }
}
