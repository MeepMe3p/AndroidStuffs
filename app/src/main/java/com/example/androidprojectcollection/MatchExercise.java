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




        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn5;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn5, selected_button,4);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn6;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn6, selected_button,5);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn7;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn7, selected_button,6);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn8;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn8, selected_button,7);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn9;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn9, selected_button,8);
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn10;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn10, selected_button,9);
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn11;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn11, selected_button,10);
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn12;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn12, selected_button,11);
                }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn13;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn13, selected_button,12);
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn14;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn14, selected_button,13);
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn15;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn15, selected_button,14);
                }
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn16;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn16, selected_button,15);
                }
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn17;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn17, selected_button,16);
                }
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn18;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn18, selected_button,17);
                }
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn19;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn19, selected_button,18);
                }
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn20;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn20, selected_button,19);
                }
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn21;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn21, selected_button,20);
                }
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn22;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn22, selected_button,21);
                }
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn23;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn23, selected_button,22);
                }
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn24;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn24, selected_button,23);
                }
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ctr == 0){
                    selected_button = btn25;
                    ctr = 1;
                }else{
                    ctr = 0;
                    mb.swap(btn25, selected_button,24);
                }
            }
        });


    }
}