package com.example.android.architecturequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.checked;
import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int question1points = 0;
    int question2points = 0;
    int question3points = 0;
    int question4points = 0;
    int question5points = 0;
    int question6points = 0;

    // Question 1 Answer for EditText
    public int questionOne(View View) {
        EditText answerQuestion1 = (EditText) findViewById(R.id.q1_editText);
        if (answerQuestion1.getText().toString().equals("Frank Lloyd Wright")) {
            question1points += 1;
        }
        return question1points;
    }

    // Question 2 Answer for Radio
    public int questionTwo(View View) {
        boolean checked = ((RadioButton) View).isChecked();

        switch (View.getId()) {
            case R.id.q2a3:
                if (checked)
                    question2points += 1;
        }
        return question2points;
    }

    // Question 3 Answer for Radio
    public int questionThree(View View) {
        boolean checked = ((RadioButton) View).isChecked();

        switch (View.getId()) {
            case R.id.q3_buttonUtrecht:
                if (checked)
                    question3points += 1;
        }
        return question3points;
    }

    // Question 4 Answer for EditText
    public int questionFour(View view) {
        EditText answerQuestion4 = (EditText) findViewById(R.id.q4_editText);
        if (answerQuestion4.getText().toString().equals("Paris")) {
            question4points += 1;
        }
        return question4points;
    }


    // Question 5 Multiple Answers for CheckBox
    public int questionFive(View View) {

        CheckBox checkBQ51 = (CheckBox) findViewById(R.id.q5_checkBox1);
        boolean check5_1 = checkBQ51.isChecked();
        CheckBox checkBQ52 = (CheckBox) findViewById(R.id.q5_checkBox2);
        boolean check5_2 = checkBQ52.isChecked();
        CheckBox checkBQ53 = (CheckBox) findViewById(R.id.q5_checkBox3);
        boolean check5_3 = checkBQ53.isChecked();
        if (check5_1 && check5_3) {
            question5points += 1;
        }
        return question5points;
    }

    // Question 6 Answer for Radio
    public int questionSix(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q6_study8:
                if (checked)
                    question6points += 1;
        }
        return question6points;
    }

    // Score Total
    public int tally(View View) {
        Toast.makeText(getApplicationContext(), getString(R.string.tally) + (question1points + question2points + question3points + question4points + question5points + question6points) + getString(R.string.possible), Toast.LENGTH_LONG).show();
        return (question1points + question2points + question3points + question4points + question5points + question6points);
    }
}
