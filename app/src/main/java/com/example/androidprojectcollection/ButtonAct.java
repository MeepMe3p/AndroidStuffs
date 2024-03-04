package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.RelativeLayout;


import java.util.Random;

public class ButtonAct extends AppCompatActivity {
    Button button1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        button1 = findViewById(R.id.btnLayout);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(ButtonAct.this, Return.class);
                startActivity(int1);
            }
        });
        btn2 = findViewById(R.id.btnInvisible);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setVisibility(View.INVISIBLE);

            }
        });
        btn3 = findViewById(R.id.btnPrint);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"SANA OL PASAR HUHUHU",Toast.LENGTH_LONG).show();
            }
        });

        ConstraintLayout layout =(ConstraintLayout) findViewById(R.id.rlVar1);

        btn4 = findViewById(R.id.btnChangeBg);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.BLUE);
            }
        });
        btn5 = findViewById(R.id.btnButtonColor);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setText("CHANGE BG");
                btn5.setBackgroundColor(Color.DKGRAY);
            }
        });

    }
}