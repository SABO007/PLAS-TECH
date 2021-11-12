package com.example.plas_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class AdminUser extends AppCompatActivity {

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminuser);
        Button ButtonAdmin;
        ButtonAdmin = findViewById(R.id.ButtonAdmin);

        firebaseAuth = FirebaseAuth.getInstance();

        ButtonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent categoryIntent = new Intent(AdminUser.this, Admin.class);
                startActivity(categoryIntent);
                finish();
            }
        });
        Button ButtonUser;
        ButtonUser = findViewById(R.id.ButtonUser);

        ButtonUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(firebaseAuth.getUid() == null) {

                    Intent categoryIntent = new Intent(AdminUser.this, User.class);
                    startActivity(categoryIntent);
                    finish();
                }
                else {
                    Intent categoryIntent = new Intent(AdminUser.this, customer.class);
                    startActivity(categoryIntent);

                }
            }
        });
        Button Buttonback1;
        Buttonback1 = findViewById(R.id.buttonback1);

        Buttonback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent categoryIntent = new Intent(AdminUser.this, StartActivity.class);
                startActivity(categoryIntent);
                finish();


            }
        });
    }
}