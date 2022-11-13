package com.example.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnEven, btnOdd;
    TextView txtQ, txtans;
    int numbers = 0;
    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQ = findViewById(R.id.txtQuestions);
        btnEven = findViewById(R.id.even);
        btnEven.setOnClickListener(this);
        btnOdd = findViewById(R.id.odd);
        btnOdd.setOnClickListener(this);

        GenerateNumbers();
    }

    private void GenerateNumbers(){

        Random rand = new Random();

        if (n <=5) {
            numbers = rand.nextInt(100) + 1;
            txtQ.setText("Question "+n);
            txtQ.setText(numbers + " Is Even or Odd?");

            if (numbers % 2 == 0) {

            } else {

            }
        }
    }
    @Override
    public void onClick(View view) {

    }

}