package com.example.studystint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.studystint.databinding.ActivityHirersBinding;
import com.example.studystint.databinding.ActivityWorkersBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class hirers extends AppCompatActivity {

    ActivityHirersBinding binding;
    String companyname1, jobp1, workdet1, cmpns1, con1;
    FirebaseDatabase db1;
    DatabaseReference refrence1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHirersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.hsup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                companyname1 = binding.companyname1.getText().toString();
                jobp1 = binding.jobp1.getText().toString();
                workdet1= binding.workdet1.getText().toString();
                cmpns1= binding.cmpns1.getText().toString();
                con1 = binding.con1.getText().toString();

                if (!companyname1.isEmpty() && !jobp1.isEmpty() && !workdet1.isEmpty() && !cmpns1.isEmpty() && !con1.isEmpty() ){
                    hrhelper users2 = new hrhelper(companyname1,jobp1,workdet1,cmpns1,con1);
                    db1 = FirebaseDatabase.getInstance();
                    refrence1 = db1.getReference("Available jobs");
                    refrence1.child(companyname1).setValue(users2).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            binding.companyname1.setText("");
                            binding.jobp1.setText("");
                            binding.workdet1.setText("");
                            binding.con1.setText("");
                            Toast.makeText(hirers.this,"succesfully uploaded",Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(hirers.this, wkrscs.class);
                            startActivity(intent);
                            finish();


                        }
                    });
                }
            }
        });



    }


}