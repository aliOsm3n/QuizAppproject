package com.example.aliothman.quizappproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);


        Intent intent = getIntent();
        int pocet = intent.getIntExtra("pocet", 0);
        TextView c = findViewById(R.id.output);
        c.setText(pocet + "/10 correctly :)");


        Context context = getApplicationContext();
        CharSequence text = pocet + "/10 correctly :)";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void Let_Start(android.view.View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
