package com.example.plas_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class customer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer2);
        Button Customerbutton3;
        Customerbutton3=findViewById(R.id.customerbutton3);
        Customerbutton3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(customer2.this,Conclusion.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );
        Button ButtonBack5;
        ButtonBack5=findViewById(R.id.buttonback5);
        ButtonBack5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(customer2.this,customer.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );

    }
}