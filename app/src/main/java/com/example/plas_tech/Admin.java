package com.example.plas_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminmodule);

        EditText secret = findViewById(R.id.editTextTextPassword3);

        Button enter = findViewById(R.id.button8);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sec =  secret.getText().toString();
                if(sec.equals("SASOHAAK")  || sec.equals("sasokaak") ){
                    startActivity(new Intent(getApplicationContext() ,AdminInterface.class));
                }
                else{
                    TextView error = findViewById(R.id.textView12);
                    error.setVisibility(View.VISIBLE);
                    error.setText("*password Incorrect");
                }
            }
        });
        Button Buttonback2;
        Buttonback2 = findViewById(R.id.buttonback2);

        Buttonback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent categoryIntent = new Intent(Admin.this, AdminUser.class);
                startActivity(categoryIntent);
                finish();


            }
        });



    }
}