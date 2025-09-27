package com.example.taomanhinhungdung;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz2Activity extends AppCompatActivity {

    Button btnA, btnB, btnC, btnD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        ((android.widget.TextView)findViewById(R.id.txtQuestion)).setText("1. What is 2 + 2?");
        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);

        btnA.setText("3");
        btnB.setText("4");
        btnC.setText("5");
        btnD.setText("22");

        btnB.setOnClickListener(v -> restartQuiz());
        btnA.setOnClickListener(v -> startActivity(new Intent(this, Quiz3Activity.class)));
        btnC.setOnClickListener(v -> restartQuiz());
        btnD.setOnClickListener(v -> restartQuiz());
    }

    private void restartQuiz() {
        Intent restart = new Intent(Quiz2Activity.this, Quiz2Activity.class);
        restart.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(restart);
        finish();
    }
}
