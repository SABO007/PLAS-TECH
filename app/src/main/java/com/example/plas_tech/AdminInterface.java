package com.example.plas_tech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminInterface extends AppCompatActivity {
    @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admininterface);
        Button Adminbutton1;
        Adminbutton1=findViewById(R.id.Adminbutton1);
        Adminbutton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(AdminInterface.this,Sashank.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );
        Button Adminbutton2;
        Adminbutton2=findViewById(R.id.Adminbutton2);
        Adminbutton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(AdminInterface.this,Sashank.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );
        Button Adminbutton3;
        Adminbutton3=findViewById(R.id.Adminbutton3);
        Adminbutton3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(AdminInterface.this,Sashank.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );
        Button Adminbutton4;
        Adminbutton4=findViewById(R.id.Adminbutton4);
        Adminbutton4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(AdminInterface.this,Sashank.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );


    }
}

