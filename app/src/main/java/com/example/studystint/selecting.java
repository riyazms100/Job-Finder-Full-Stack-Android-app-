package com.example.studystint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class selecting extends AppCompatActivity {

    ImageView wrk;
    ImageView hrr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecting);

        wrk = findViewById(R.id.wrk);
        hrr = findViewById(R.id.hrr);
    }

    public void worker(View view) {
        Intent w = new Intent(this, workers.class);
        startActivity(w);
    }

    public void hirer(View view) {
        Intent h= new Intent(this, hirers.class);
        startActivity(h);
    }
}