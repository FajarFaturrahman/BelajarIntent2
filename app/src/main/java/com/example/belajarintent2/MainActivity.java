package com.example.belajarintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button login;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        login.setOnClickListener(this);
        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                Intent login = new Intent(MainActivity.this, Wheater.class);
                startActivity(login);
                break;

            case R.id.signUp:
                Intent signUp = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(signUp);
                break;
            default:
                break;
        }
    }
}
