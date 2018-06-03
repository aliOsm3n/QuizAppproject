package com.example.aliothman.quizappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Go_Quiz(android.view.View view) {
        Intent i = new Intent(this, QuizActivity.class);
        TextView meno = findViewById(R.id.message);
        i.putExtra("meno", meno.getText().toString());
        startActivity(i);
    }
}
