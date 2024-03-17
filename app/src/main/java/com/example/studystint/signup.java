package com.example.studystint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ProgressBar;
import android.view.View;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText signup_email, signup_password;
    private Button signup_button;
    private TextView loginRedirectText;

    private ProgressBar loadingProgressBar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        auth = FirebaseAuth.getInstance();
        signup_email = findViewById(R.id.signup_email);
        signup_password = findViewById(R.id.signup_password);
        signup_button = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        loadingProgressBar = findViewById(R.id.progressBar);

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user =  signup_email.getText().toString().trim();
                String pass = signup_password.getText().toString().trim();

                if (user.isEmpty()){
                    signup_email.setError("Email cannot be empty");
                }
                if (pass.isEmpty()){
                    signup_password.setError("Password cannot be empty");
                } else{
                    showProgressBar();
                    auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            hideProgressBar();
                            if (task.isSuccessful()) {
                                Toast.makeText(signup.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(signup.this, selecting.class));
                            } else {
                                Toast.makeText(signup.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });

        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signup.this, selecting.class));
            }
        });

    }
    private void showProgressBar() {
        loadingProgressBar.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        loadingProgressBar.setVisibility(View.GONE);
    }
}