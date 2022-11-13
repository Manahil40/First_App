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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQ = findViewById(R.id.txtQuestions);

    }

    private void GenerateNumbers(){

        Random rand = new Random();
        numbers = rand.nextInt();

        if(numbers % 2 == 0){

        }

        else{

        }

    }
    @Override
    public void onClick(View view) {

    }

}