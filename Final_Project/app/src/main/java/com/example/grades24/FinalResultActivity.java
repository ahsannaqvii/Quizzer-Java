package com.example.grades24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import com.example.grades24.data.model.constants;

//import constants
public class FinalResultActivity extends AppCompatActivity {


    public void startAgain(View view){
        Intent lo=new Intent(FinalResultActivity.this,HomeActivity.class);
        startActivity(lo);
    }
    private TextView tvSubject, tvCorrect, tvIncorrect, tvEarned, tvOverallStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);

        Intent intent = getIntent();
        int correctAnswer = intent.getIntExtra(constants.CORRECT, 0);
        int incorrectAnswer = intent.getIntExtra(constants.INCORRECT, 0);
        String subject = intent.getStringExtra(constants.SUBJECT);
        int earnedPoints = (correctAnswer * constants.CORRECT_POINT) - (incorrectAnswer * constants.INCORRECT_POINT);

        tvSubject = findViewById(R.id.textView16);
        tvCorrect = findViewById(R.id.textView19);
        tvIncorrect = findViewById(R.id.textView27);
        tvEarned = findViewById(R.id.textView28);
        tvOverallStatus = findViewById(R.id.textView29);
//        tvCorrect.setText(correctAnswer);
//        tvIncorrect.setText(incorrectAnswer);
//        tvOverallStatus.setText("15");
//        tvEarned.setText(earnedPoints);
        findViewById(R.id.imageViewFinalResultQuiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalResultActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalResultActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }





//    private void displayData(Attempt attempt) {
//
//        tvSubject.setText(attempt.getSubject());
//        tvCorrect.setText(String.valueOf(attempt.getCorrect()));
//        tvIncorrect.setText(String.valueOf(attempt.getIncorrect()));
//        tvEarned.setText(String.valueOf(attempt.getEarned()));
//        tvOverallStatus.setText(String.valueOf(attempt.getOverallPoints()));
//        tvDate.setText(Utils.formatDate(attempt.getCreatedTime()));
//
//    }



}
