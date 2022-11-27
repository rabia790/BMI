package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mass, height;
    Button bmiButton;
    int bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mass = findViewById(R.id.etMAss);
        height = findViewById(R.id.etHeight);
        bmiButton = findViewById(R.id.btnCalculate);
        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calculateBmi(mass.getText().toString(), height.getText().toString());
            }
        });
    }
private void calculateBmi(String mass, String height){
        bmi = Integer.parseInt(mass)/Integer.parseInt(height);
}

}