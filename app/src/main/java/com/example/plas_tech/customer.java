package com.example.plas_tech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class customer extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer);
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
                        Intent categoryIntent=new Intent(customer.this,User.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );
    }
}
