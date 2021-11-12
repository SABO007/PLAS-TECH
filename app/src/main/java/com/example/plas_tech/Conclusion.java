package com.example.plas_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Conclusion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conclusion);
        Button ButtonBack7;
        ButtonBack7=findViewById(R.id.buttonback7);
        ButtonBack7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(Conclusion.this,customer.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );
        Button ButtonBack8;
        ButtonBack8=findViewById(R.id.buttonback8);
        ButtonBack8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(Conclusion.this,StartActivity.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );

    }
}