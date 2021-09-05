package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public  void onClick(View view)
    {

        EditText email;
        EditText pass;
        EditText pass2;

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        email = findViewById(R.id.editTextTextEmailAddress2);
        pass = findViewById(R.id.editTextTextPassword3);
        pass2=findViewById(R.id.editTextTextPassword4);
        if (email.getText().toString().isEmpty() || pass.getText().toString().isEmpty()||pass2.getText().toString().isEmpty() )
        {
            Toast.makeText(getApplicationContext(), "Enter all fields ", Toast.LENGTH_SHORT).show();

         }

        else
        {
//

             if(!(email.getText().toString().trim().matches(emailPattern)))
            {
                Toast.makeText(getApplicationContext(), "Enter Valid Email Address ", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Account Created ", Toast.LENGTH_SHORT).show();
                Intent oc = new Intent(SignUp.this, MainActivity.class);
                startActivity(oc);
                User u1=new User(email.getText().toString(),pass.getText().toString());
//                DatabaseReference reference;
                FirebaseDatabase db=FirebaseDatabase.getInstance();
                DatabaseReference dbref=db.getReference();
                dbref.child("Users").child(pass2.getText().toString()).setValue(u1);
            }
        }
}
}