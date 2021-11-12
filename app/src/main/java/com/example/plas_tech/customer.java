package com.example.plas_tech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class customer extends AppCompatActivity {
    FirebaseAuth firebaseAuth;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getUid() == null) {
            startActivity(new Intent(getApplicationContext(), userLogin.class));
        }

        Button CustomerButton2;
        CustomerButton2=findViewById(R.id.Customerbutton2);
        CustomerButton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(customer.this,customer2.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );
        Button ButtonBack4;
        ButtonBack4=findViewById(R.id.buttonback4);
        ButtonBack4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        FirebaseAuth.getInstance().signOut();
                        Intent categoryIntent=new Intent(customer.this,User.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );
    }
}
