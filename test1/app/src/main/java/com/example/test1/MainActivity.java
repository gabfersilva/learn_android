package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView textViewcounter;
    private Button buttonmore;
    private Button buttonless;
    private Button buttonabout;
    private Button buttoncam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewcounter = findViewById(R.id.textViewcounter);
        buttonless = findViewById(R.id.buttonless);
        buttonmore = findViewById(R.id.buttonmore);
        buttonabout = findViewById(R.id.buttonabout);
        buttoncam = findViewById(R.id.buttoncam);
        textViewcounter.setText(String.valueOf(this.getcounter()));

    }
    public Integer getcounter(){

        return this.counter;
    }
    public void add(View view){
        this.counter++;
        textViewcounter.setText(String.valueOf(this.getcounter()));
    }
    public void reduce(View view){
        this.counter--;
        textViewcounter.setText(String.valueOf(this.getcounter()));
    }
    public void openabout(View view){
        Intent i = new Intent(MainActivity.this, AboutActivity2.class);
        i.putExtra("contador",this.getcounter());
        startActivity(i);
    }
    public void opencam(View view){
        Intent i = new Intent(MainActivity.this, CamActivity2.class);
        startActivity(i);
    }
}