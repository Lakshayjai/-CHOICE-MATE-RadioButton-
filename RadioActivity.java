package com.example.portfolioapp;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class RadioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        RadioGroup rg = findViewById(R.id.radioGroup);

        findViewById(R.id.btnSelect).setOnClickListener(v -> {
            int id = rg.getCheckedRadioButtonId();
            RadioButton rb = findViewById(id);
            Toast.makeText(this, rb.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}
