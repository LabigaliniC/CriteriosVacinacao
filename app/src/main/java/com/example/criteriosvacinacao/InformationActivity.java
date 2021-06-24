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

        TextView showName = findViewById(R.id.show_name);
        TextView email_Value = findViewById(R.id.email_value);
        TextView previsionValue = findViewById(R.id.prevision_value);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        String priority = intent.getStringExtra(MainActivity.EXTRA_PRIORITY);

        showName.setText(name);
        email_Value.setText(email);
        previsionValue.setText(priority);
    }
}
