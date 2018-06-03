package com.example.aliothman.quizappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    int pocetDobrych = 0;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent i = getIntent();
        String omg = i.getStringExtra("meno");
        TextView c = findViewById(R.id.welcome);
        c.setText("Welcome " + omg);
    }

    public void Result(android.view.View view) {
        Cheeck_Radios();
        checkCorrectName();
        checkCheckbox();
        Intent ii = new Intent(this, FinishActivity.class);
        ii.putExtra("pocet", pocetDobrych);
        startActivity(ii);
    }

    public void Cheeck_Radios() {
        if (checkQuestion1()) {
            pocetDobrych++;
        }

        if (checkQuestion2()) {
            pocetDobrych++;
        }

        if (checkQuestion3()) {
            pocetDobrych++;
        }

        if (checkQuestion4()) {
            pocetDobrych++;
        }

        if (checkQuestion5()) {
            pocetDobrych++;
        }

        if (checkQuestion6()) {
            pocetDobrych++;
        }

    }

    public void checkCheckbox() {
        CheckBox ok1 = findViewById(R.id.cb_correct1);
        CheckBox ok2 = findViewById(R.id.cb_correct2);
        CheckBox ko1 = findViewById(R.id.cb_notcorrect1);
        CheckBox ko2 = findViewById(R.id.cb_notcorrect2);
        CheckBox kO3 = findViewById(R.id.cb_notcorrect3);

        if (ok1.isChecked() && ok2.isChecked() && !ko1.isChecked() && !ko2.isChecked() && kO3.isChecked()) {
            pocetDobrych += 2;
            Log.d(TAG, pocetDobrych + "checkCheckbox");
        }

    }


    public void checkCorrectName() {
        TextView movie = findViewById(R.id.nemo);
        if (movie.getText().toString().equals("finding nemo")) {
            pocetDobrych += 2;
            Log.d(TAG, pocetDobrych + "checkCorrectName1");

        } else if (movie.getText().toString().equals("nemo")) {
            pocetDobrych += 2;
            Log.d(TAG, pocetDobrych + "");
            Log.d(TAG, pocetDobrych + "checkCorrectName2");
        }
    }

    public boolean checkQuestion1() {
        RadioGroup rg =  findViewById(R.id.R1);

        if (rg.getCheckedRadioButtonId() == R.id.forrestgump) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion2() {
        RadioGroup rg = findViewById(R.id.R2);

        if (rg.getCheckedRadioButtonId() == R.id.dirtydancing) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion3() {
        RadioGroup rg = findViewById(R.id.R3);

        if (rg.getCheckedRadioButtonId() == R.id.imitationgame) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion4() {
        RadioGroup rg = findViewById(R.id.R4);

        if (rg.getCheckedRadioButtonId() == R.id.silence) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion5() {
        RadioGroup rg =  findViewById(R.id.R5);

        if (rg.getCheckedRadioButtonId() == R.id.godfather) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion6() {
        RadioGroup rg =  findViewById(R.id.R6);

        if (rg.getCheckedRadioButtonId() == R.id.starwars) {
            return true;
        }

        return false;
    }
}
