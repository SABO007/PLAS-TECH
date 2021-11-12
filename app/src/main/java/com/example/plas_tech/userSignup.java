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

public class userSignup extends AppCompatActivity {
//    globals
    private FirebaseAuth firebaseAuth;
    EditText sign_up_name;
    EditText sign_up_email;
    EditText password;
    EditText password_2;
    String _name;
    String _email;
    String _password;
    String _password_2;
    TextView errMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupdetails);

//        basic is_Logged in verification.
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getUid() != null)
        {
            startActivity(new Intent(this , customer.class));
            finish();
        }


//        hooks if any
        sign_up_name = findViewById(R.id.entername);
        sign_up_email = findViewById(R.id.phoneno);
        password = findViewById(R.id.enterpass);
        password_2 = findViewById(R.id.reenterpass);


//        on clicks'
        Button ButtonSignup =findViewById(R.id.buttonsignup);
        ButtonSignup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

//                        //previous code
//                        Intent categoryIntent=new Intent(userSignup.this,customer.class);
//                        startActivity(categoryIntent);
//                        finish();
                        _name = sign_up_name.getText().toString();
                        _email = sign_up_email.getText().toString();
                        _password = password.getText().toString();
                        _password_2 = password_2.getText().toString();
                        if(_name.isEmpty())
                        {
                            System.out.println("hmm, 1");
                            errMsg.setVisibility(View.VISIBLE);
                            errMsg.setText("* Name not valid.");
                        }
                        else if(_email.isEmpty())
                        {
                            System.out.println("hmm, 1");
                            errMsg.setVisibility(View.VISIBLE);
                            errMsg.setText("* Email not valid.");
                        }
                        else if(_password.isEmpty())
                        {
                            System.out.println("hmm, 1");
                            errMsg.setVisibility(View.VISIBLE);
                            errMsg.setText("* Password cant be null.");
                        }
                        else if(!_password.equals(_password_2))
                        {
                            System.out.println("hmm, 1");
                            errMsg.setVisibility(View.VISIBLE);
                            errMsg.setText("* Passwords doesn't match.");
                        }
                        else{
                            signUpWithEmailAndPassword(_name , _email , _password);
                        }

                    }
                }
        );
    }

    private void signUpWithEmailAndPassword(String name, String email, String password)
    {
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.createUserWithEmailAndPassword(email , password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            System.out.println("worked ");
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                            Toast.makeText(getApplicationContext(), "User created Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext() , customer.class));
                            finish();
                        }
                        else {
                            System.out.println("didnt worked ");
                            Toast.makeText(getApplicationContext(), task.getException().getMessage().toString().toString(),
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}
