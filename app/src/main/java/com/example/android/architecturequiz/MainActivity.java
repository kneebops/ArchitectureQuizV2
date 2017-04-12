package com.example.android.architecturequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.checked;
import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Question 1 Answer for EditText
    public int questionOne(View v) {
        String q1A = "Frank Lloyd Wright";
        String q1B = "Lloyd Wright";
        String q1C = "frank lloyd wright";


        EditText answerQuestionOne = (EditText) findViewById(R.id.q1editText);
        String questionOneAnswer = answerQuestionOne.getText().toString();
        if (questionOneAnswer.equalsIgnoreCase(q1A) || questionOneAnswer.equalsIgnoreCase(q1B) || questionOneAnswer.equalsIgnoreCase(q1C)) {
            score += 1;
        }
        Log.v("MainActivity", questionOneAnswer);
        return score;
    }


    // Question 2 Answer for Radio
    public int questionTwo(View View) {
        boolean checked = ((RadioButton) View).isChecked();

        switch (View.getId()) {
            case R.id.q2a3:
                if (checked)
                    score += 1;
        }
        return score;
    }

    // Question 3 Answer for Radio
    public int questionThree(View View) {
        boolean checked = ((RadioButton) View).isChecked();

        switch (View.getId()) {
            case R.id.q3_buttonUtrecht:
                if (checked)
                    score += 1;
        }
        return score;
    }

//    // Question 4 Answer for EditText
//    public int questionFour(View view) {
//        EditText answerQuestion4 = (EditText) findViewById(R.id.q4_editText);
//        if (answerQuestion4.getText().toString().equals("Paris")) {
//            score += 1;
//        }
//        return score;
//    } //

    public int questionFour(View v) {
        String q4A = "Paris";
        String q4B = "paris";


        EditText answerQuestionFour = (EditText) findViewById(R.id.q4_editText);
        String questionFourAnswer = answerQuestionFour.getText().toString();
        if (questionFourAnswer.equalsIgnoreCase(q4A) || questionFourAnswer.equalsIgnoreCase(q4B)) {
            score += 1;
        }
        Log.v("MainActivity", questionFourAnswer);
        return score;
    }
    //

    // Question 5 Multiple Answers for CheckBox
    public int questionFive(View View) {

        CheckBox checkBQ51 = (CheckBox) findViewById(R.id.q5_checkBox1);
        boolean check5_1 = checkBQ51.isChecked();
        CheckBox checkBQ52 = (CheckBox) findViewById(R.id.q5_checkBox2);
        boolean check5_2 = checkBQ52.isChecked();
        CheckBox checkBQ53 = (CheckBox) findViewById(R.id.q5_checkBox3);
        boolean check5_3 = checkBQ53.isChecked();
        if (check5_1 && check5_3) {
            score += 1;
        }
        return score;
    }

    // Question 6 Answer for Radio
    public int questionSix(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q6_study8:
                if (checked)
                    score += 1;
        }
        return score;
    }

    // Score Total
    public int tally(View View) {
        Toast.makeText(getApplicationContext(), getString(R.string.tally) + (score) + getString(R.string.possible), Toast.LENGTH_LONG).show();
        return (score);
    }
}
