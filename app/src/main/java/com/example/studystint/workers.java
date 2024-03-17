package com.example.studystint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.studystint.databinding.ActivityWorkersBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class workers extends AppCompatActivity {

    ActivityWorkersBinding binding;
    String name1, age1, contact1, education1;
    FirebaseDatabase db;
    DatabaseReference refrence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWorkersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.saveupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1 = binding.name1.getText().toString();
                age1 = binding.age1.getText().toString();
                contact1= binding.contact1.getText().toString();
                education1= binding.education1.getText().toString();

                if (!name1.isEmpty() && !age1.isEmpty() && !contact1.isEmpty() && !education1.isEmpty()){
                    wkhelper users = new wkhelper(name1,age1,contact1,education1);
                    db = FirebaseDatabase.getInstance();
                    refrence = db.getReference("people Available to work");
                    refrence.child(name1).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            binding.name1.setText("");
                            binding.age1.setText("");
                            binding.contact1.setText("");
                            binding.education1.setText("");
                            Toast.makeText(workers.this,"succesfully uploaded",Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(workers.this, hrrscs.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });



    }
    
}
