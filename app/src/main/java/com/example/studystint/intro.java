package com.example.studystint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class intro extends AppCompatActivity {

    Button loginbtn;
    TextView sup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        loginbtn = findViewById(R.id.loginbtn);
    }

    public void myIntent(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }

    public void mysp1(View view) {
        Intent spf = new Intent(this, signup.class);
        startActivity(spf);
    }


}