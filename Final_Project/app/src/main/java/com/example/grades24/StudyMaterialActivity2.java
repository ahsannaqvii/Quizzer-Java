package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudyMaterialActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material2);
    }
    public void goHome(View view) {
        Intent lo=new Intent(StudyMaterialActivity2.this,HomeActivity.class);
        startActivity(lo);
    }
}
