package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button layoutEx;
    Button buttonEx;
    Button calcEx;
    Button connectEx;
    Button passingIntents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutEx = (Button) findViewById(R.id.btnButtonLayoutExercise);
        layoutEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, LayoutExercise.class);
                startActivity(intent1);
            }
        });
        buttonEx = (Button) findViewById(R.id.btnButtonExercise);
        buttonEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ButtonAct.class);
                startActivity(intent2);
            }
        });
        calcEx = (Button) findViewById(R.id.btnCalc);
        calcEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, CalculatorExercise.class);
                startActivity(intent3);
            }
        });
        connectEx = (Button) findViewById(R.id.btnMatch);
        connectEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, MatchExercise.class);
                startActivity(intent4);
            }
        });
        passingIntents = (Button) findViewById(R.id.btnPassingIntents);
        passingIntents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this,PassingIntentsExercise.class);
                startActivity(intent5);
            }
        });


    }
}