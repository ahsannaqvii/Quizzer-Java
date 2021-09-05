package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudyMaterialsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_materials);
    }

    public void goHome(View view) {
        Intent lo=new Intent(StudyMaterialsActivity.this,HomeActivity.class);
        startActivity(lo);
    }
    public void nextAct(View view ){
        Intent lo=new Intent(StudyMaterialsActivity.this,StudyMaterialActivity2.class);
        startActivity(lo);
    }
}
