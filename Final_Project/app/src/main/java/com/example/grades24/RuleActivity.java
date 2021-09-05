package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RuleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);
    }
    public void goHome(View view)
    {
        Intent lo=new Intent(RuleActivity.this, HomeActivity.class);
        startActivity(lo);
    }
}
