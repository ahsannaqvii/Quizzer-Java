package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        EditText email;
        EditText pass;
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        email = findViewById(R.id.editTextTextEmailAddress);
        pass = findViewById(R.id.editTextTextPassword);
        if (email.getText().toString().isEmpty() && pass.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter Email Address and Password", Toast.LENGTH_LONG).show();
        } else if (email.getText().toString().isEmpty() && !(pass.getText().toString().isEmpty())) {
            Toast.makeText(getApplicationContext(), "Enter Email Address ", Toast.LENGTH_SHORT).show();
        } else if (!(email.getText().toString().isEmpty()) && pass.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter Password ", Toast.LENGTH_SHORT).show();
        } else {
            if(!(email.getText().toString().trim().matches(emailPattern)))
            {
                Toast.makeText(getApplicationContext(), "Enter Valid Email Address ", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent oc = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(oc);
            }
        }
    }

    public  void OnSignUp(View view)
    {
        Intent signup= new Intent(MainActivity.this,SignUp.class);
        startActivity(signup);
    }
}