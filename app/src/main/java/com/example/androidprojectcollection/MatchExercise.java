package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidprojectcollection.MatchLogic.Matching;

public class MatchExercise extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btnRestart;
    int ctr = 0;
    Button selected_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_exercise);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);
        btn18 = (Button) findViewById(R.id.btn18);
        btn19 = (Button) findViewById(R.id.btn19);
        btn20 = (Button) findViewById(R.id.btn20);
        btn21 = (Button) findViewById(R.id.btn21);
        btn22 = (Button) findViewById(R.id.btn22);
        btn23 = (Button) findViewById(R.id.btn23);
        btn24 = (Button) findViewById(R.id.btn24);
        btn25 = (Button) findViewById(R.id.btn25);

        Button[] btnArray = new Button[25];
        btnArray[0] = btn1;
        btnArray[1] = btn2;
        btnArray[2] = btn3;
        btnArray[3] = btn4;
        btnArray[4] = btn5;
        btnArray[5] = btn6;
        btnArray[6] = btn7;
        btnArray[7] = btn8;
        btnArray[8] = btn9;
        btnArray[9] = btn10;
        btnArray[10] = btn11;
        btnArray[11] = btn12;
        btnArray[12] = btn13;
        btnArray[13] = btn14;
        btnArray[14] = btn15;
        btnArray[15] = btn16;
        btnArray[16] = btn17;
        btnArray[17] = btn18;
        btnArray[18] = btn19;
        btnArray[19] = btn20;
        btnArray[20] = btn21;
        btnArray[21] = btn22;
        btnArray[22] = btn23;
        btnArray[23] = btn24;
        btnArray[24] = btn25;


        Matching mb = new Matching(btnArray);
        btnRestart = findViewById(R.id.btnRestart);
        mb.restart();
        int[] colors = mb.getColors();
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.restart();
                ctr = 0;
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn1;
                    ctr = 1;
                }else {
                    ctr = 0;
                    mb.swap(btn1, selected_button,0);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn2;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn2, selected_button,1);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn3;
                    ctr = 1;
                } else{
                    ctr = 0;
                    mb.swap(btn3, selected_button,2);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn4;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn4, selected_button,3);
                }
            }
        });



    }
}