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

        TextView showNameLabel = findViewById(R.id.show_name);
        //TextView age_Value = findViewById(R.id.age_value);
        TextView email_Value = findViewById(R.id.email_value);
        TextView statusTextView = findViewById(R.id.prevision_value);

        Intent intent = getIntent();
        int name = intent.getIntExtra(MainActivity.EXTRA_NAME, 0);
        int email = intent.getIntExtra(MainActivity.EXTRA_EMAIL, 0);
        int priority = intent.getIntExtra(MainActivity.EXTRA_PRIORITY, 0);


        showNameLabel.setText(Integer.toString(name));
        email_Value.setText(Integer.toString(email));
        statusTextView.setText(Integer.toString(priority));

    }
}
