package com.example.plas_tech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class userLogin extends AppCompatActivity {

//    globals
    EditText _email;
    EditText _password;
    TextView incorrect;

    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logindetails);

//        basic verification
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getUid() != null)
        {
            startActivity(new Intent(this , customer.class));
            finish();
        }

//        hooks
        _email = findViewById(R.id.editTextPhone);
        _password = findViewById(R.id.phoneno);
        incorrect = findViewById(R.id.incorrect1);


        Button LOG = findViewById(R.id.ButtonLOG);
        EditText password = findViewById(R.id.phoneno);
        LOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_email.getText().toString().isEmpty())
                    incorrect.setText("*Email cant be empty.");
                else if(_password.getText().toString().isEmpty())
                    incorrect.setText("*password cant be empty.");
                else
                    loginWithEmailAndPassword(_email.getText().toString(),_password.getText().toString());
            }
        });

    }

    private void loginWithEmailAndPassword(String email, String password) {
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithEmailAndPassword(email , password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information

                    FirebaseUser user = firebaseAuth.getCurrentUser();
                    Intent i = new Intent(getApplicationContext(), customer.class);
                    startActivity(i);


//                                    updateUI(user);
                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(userLogin.this, task.getException().getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
