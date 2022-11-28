package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mass, height;
    Button bmiButton;
    int bmi;
    String cal;
    TextView resulttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mass = findViewById(R.id.etMAss);
        height = findViewById(R.id.etHeight);
        bmiButton = findViewById(R.id.btnCalculate);
        resulttxt = findViewById(R.id.result);
        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calculateBmi(mass.getText().toString(), height.getText().toString());
            }
        });
    }

    private void calculateBmi(String mass, String height) {
        bmi = Integer.parseInt(mass) / Integer.parseInt(height);
        String s1 = String.valueOf(bmi);
        resulttxt.setText(s1);

        // Intent intent = new Intent(MainActivity.this, CalculatedBmiActivity.class);
        //intent.putExtra("key", String.valueOf(bmi));
        // startActivity(intent);
    }

}