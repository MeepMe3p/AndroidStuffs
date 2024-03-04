package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class CalculatorExercise extends AppCompatActivity {
    Button nine,eight,seven,six,five,four,three,two,one,zero,add,sub,mult,div,equal,clr,dot;
    EditText disp;
    EditText bottom;
    double first_num=0;
    double second_num;
    int selected;
    boolean has = false;

    Calculator calculator;
        Calculator bottom_calculator = new Calculator(first_num,'+');

    Stack<Double> numbers = new Stack<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);
        disp  = (EditText) findViewById(R.id.tfCalcDis);
        disp.setEnabled(false);
        bottom = (EditText) findViewById(R.id.tfTemp);
        bottom.setEnabled(false);


        nine = findViewById(R.id.btnNine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("9");
                bottom.append("9");

            }
        });
        eight = (Button) findViewById(R.id.btnEight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("8");
                bottom.append("8");
            }
        });
        seven = (Button)findViewById(R.id.btnSeven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("7");
                bottom.append("7");

            }
        });
        six = (Button)findViewById(R.id.btnSix);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("6");
                bottom.append("6");

            }
        });
        five = (Button)findViewById(R.id.btnFive);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("5");
                bottom.append("5");

            }
        });
        four = (Button)findViewById(R.id.btnFour);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("4");
                bottom.append("4");

            }
        });
        three = (Button)findViewById(R.id.btnThree);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("3");
                if(has){
                    bottom.setText("3");
                    has = false;
                }else{
                    bottom.append("3");

                }
            }
        });
        two = (Button)findViewById(R.id.btnTwo);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("2");
                if(has){
                    bottom.setText("2");
                    has = false;
                }else{
                    bottom.append("2");

                }

            }
        });
        one = (Button)findViewById(R.id.btnOne);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("1");
                if(has){
                    bottom.setText("1");
                    has = false;
                }else{
                    bottom.append("1");

                }
            }
        });
        zero = (Button)findViewById(R.id.btnZero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append("0");
            }
        });
        add = (Button)findViewById(R.id.btnPlus);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num = Double.parseDouble(String.valueOf(bottom.getText()));
//                bottom_calculator
                bottom_calculator.setBottom_ans(first_num+bottom_calculator.getBottom_ans()) ;

                disp.append("+");
                has = true;
                bottom.setText("");
                bottom.setText(bottom_calculator.getBottom_ans()+"");
                selected = 0;
            }
        });
        sub = (Button)findViewById(R.id.btnSub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_num = Double.parseDouble(String.valueOf(disp.getText()));
                bottom.setText("");
                disp.append("-");

                selected = 1;
            }
        });
        mult = (Button)findViewById(R.id.btnMul);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                first_num = Double.parseDouble(String.valueOf(bottom.getText()));
//                bottom.setText("");
//                disp.append("*");
                first_num = Double.parseDouble(String.valueOf(bottom.getText()));
//                bottom_calculator = new Calculator(first_num,'+');
                bottom_calculator.setBottom_ans(first_num*bottom_calculator.getBottom_ans()) ;



                disp.append("*");
                bottom.setText("");
                has = true;

                bottom.setText(bottom_calculator.getBottom_ans()+"");
                selected = 2;
            }
        });
        div = (Button)findViewById(R.id.btnDiv);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num = Double.parseDouble(String.valueOf(disp.getText()));
                bottom.setText("");
                disp.append("/");

                selected = 3;
            }
        });
        clr = (Button)findViewById(R.id.btnClr);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText("");
                bottom.setText("");
            }
        });
        dot = (Button) findViewById(R.id.btnDot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.append(".");
            }
        });


        equal = (Button)findViewById(R.id.btnEquals);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second_num = Double.parseDouble(String.valueOf(bottom.getText()));

//                disp.setText(calculator.calculate()+"");
                calculator = new Calculator(String.valueOf(disp.getText()));

                calculator.magic();
                disp.setText(calculator.comp()+"");






                switch(selected){
                    case 0:
                        double sum = first_num+second_num;
                        bottom.setText(""+sum);
                        break;
                    case 1:
                        double sub = first_num-second_num;
                        bottom.setText(""+sub);
                        break;

                    case 2:
                        double pro = first_num*second_num;
                        bottom.setText(""+pro);
                        break;
                    case 3:
                        double quo;
                        try{
                            quo = first_num/second_num;
                            bottom.setText(""+quo);

                        }catch(ArithmeticException e){
                            bottom.setText("cant divide zero wahahaha");
                        }
                        break;
                }
            }
        });



    }


}