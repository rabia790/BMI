package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatedBmiActivity extends AppCompatActivity {
    String bmi = "";
    TextView CalBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculated_bmi);
        CalBmi = findViewById(R.id.calResult);
        bmi = getIntent().getStringExtra("key");
        CalBmi.setText(bmi);
    }
}