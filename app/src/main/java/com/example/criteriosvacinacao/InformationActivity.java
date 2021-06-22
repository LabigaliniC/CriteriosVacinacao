package com.example.criteriosvacinacao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InformationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        TextView ageTextView = findViewById(R.id.show_name);
        TextView scoreTextView = findViewById(R.id.age_value);
        TextView mortalityTextView = findViewById(R.id.email_value);
        TextView statusTextView = findViewById(R.id.prevision_value);

        Intent intent = getIntent();
        int age = intent.getIntExtra(MainActivity.EXTRA_AGE, 0);
        int score = intent.getIntExtra(MainActivity.EXTRA_SCORE, 0);
        int mortality = intent.getIntExtra(MainActivity.EXTRA_MORTALITY, 0);
        boolean serious = intent.getBooleanExtra(MainActivity.EXTRA_SERIOUS, false);

        ageTextView.setText(Integer.toString(age));
        scoreTextView.setText(Integer.toString(score));
        mortalityTextView.setText(Integer.toString(mortality));
        statusTextView.setText(serious ? "Pancreatite grave" : "Pancreatite não grave");
    }
}
