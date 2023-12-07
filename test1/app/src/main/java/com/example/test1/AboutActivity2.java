package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity2 extends AppCompatActivity {
    private TextView txtcounter;
    private  Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);
        Intent intent = getIntent();
        this.counter = intent.getIntExtra("contador", 0);
        txtcounter = findViewById(R.id.txtcounter);
        txtcounter.setText(String.valueOf(this.counter));
    }
}