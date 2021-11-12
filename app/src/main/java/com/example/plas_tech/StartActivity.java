package com.example.plas_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    private Button Buttonstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        Buttonstart =findViewById(R.id.Buttonstart);
        Buttonstart.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent categoryIntent=new Intent(StartActivity.this,AdminUser.class);
                        startActivity(categoryIntent);
                        finish();
                    }
                }
        );

    }
}