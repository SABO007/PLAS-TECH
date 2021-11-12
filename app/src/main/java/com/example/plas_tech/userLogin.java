package com.example.plas_tech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class userLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logindetails);

        Button LOG = findViewById(R.id.ButtonLOG);
        EditText password = findViewById(R.id.phoneno);
        LOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass=password.getText().toString();
                if(pass.equals("SASOHAAK")  || pass.equals("sasokaak") ){
                    startActivity(new Intent(getApplicationContext() , customer.class));
                }
                else{
                    TextView error1 = findViewById(R.id.incorrect1);
                    error1.setVisibility(View.VISIBLE);
                    error1.setText("*password Incorrect");
                }
            }
        });





    }
}
