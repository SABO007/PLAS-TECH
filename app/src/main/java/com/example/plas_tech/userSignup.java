package com.example.plas_tech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class userSignup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupdetails);
        Button ButtonSignup =findViewById(R.id.buttonsignup);
        ButtonSignup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(userSignup.this,customer.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );


    }
}
