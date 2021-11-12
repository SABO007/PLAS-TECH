package com.example.plas_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sashank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_sashank);
        Button Buttonback4;
        Buttonback4 = findViewById(R.id.buttonback3);

        Buttonback4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent categoryIntent = new Intent(Sashank.this, AdminInterface.class);
                startActivity(categoryIntent);
                finish();


            }
        });
    }
}