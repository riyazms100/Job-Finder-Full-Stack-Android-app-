package com.example.studystint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hrrscs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hrrscs);



    }

    public void rte(View view) {
        Intent fgr = new Intent(this, activity_dashboard2x.class);
        startActivity(fgr);
    }
}