package com.example.plas_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.userloginmodule);

        Button login = findViewById(R.id.ButtonLogin);
        Button signUp = findViewById(R.id.ButtonSignup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(getApplicationContext(),userLogin.class ));
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), userSignup.class));
            }
        });
        Button ButtonBack6;
        ButtonBack6=findViewById(R.id.buttonback6);
        ButtonBack6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(User.this,StartActivity.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );


    }
}