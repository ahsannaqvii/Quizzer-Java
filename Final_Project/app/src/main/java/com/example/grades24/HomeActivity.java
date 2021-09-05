package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void rules(View view) {
        Intent lo=new Intent(HomeActivity.this,RuleActivity.class);
        startActivity(lo);
    }
    public void logout(View view)
    {
        Intent lo=new Intent(HomeActivity.this,MainActivity.class);
        startActivity(lo);
    }
    public void study(View view)
    {
        Intent lo=new Intent(HomeActivity.this,StudyMaterialsActivity.class);
        startActivity(lo);
    }
    public void startQuiz(View view) {
        Intent lo=new Intent(HomeActivity.this,StartQuizActivity.class);
        startActivity(lo);
    }
}