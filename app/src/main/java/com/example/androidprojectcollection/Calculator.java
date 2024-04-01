package com.example.androidprojectcollection;

import android.widget.Toast;

import java.util.Stack;

public class Calculator {
    public String equation;
    Stack<Double> stack = new Stack<>();
    Stack<Character> operation = new Stack<>();
    Stack <String> eq = new Stack<>();
    double first;
    char sec;
    public static double bottom_ans =0;
    public Calculator(String equation) {
        this.equation = equation;
    }
    public Calculator(double first, char sec){
        this.first = first;
        this.sec = sec;
    }


    public double getBottom_ans() {
        return bottom_ans;
    }

    public void setBottom_ans(double bottom_ans) {
        this.bottom_ans = bottom_ans;
    }

    public void magic(){
        System.out.println(equation);
        StringBuilder str = new StringBuilder();

        int i=0;
        while(i<equation.length()){
            char ch = equation.charAt(i);
            if(equation.charAt(i) == '+'){
//                System.out.println(equation.charAt(i));
                operation.push('+');
                i++;
            }
            if(equation.charAt(i) == '-'){
//                System.out.println(equation.charAt(i));
                operation.push('-');
                i++;
            }
            if(equation.charAt(i) == '*'){
//                System.out.println(equation.charAt(i));
                operation.push('*');
                i++;
            }
            if(equation.charAt(i) == '/'){
//                System.out.println(equation.charAt(i));
                operation.push('/');
                i++;
            }

            if(Character.isDigit(ch)){
                double val = 0;
                while(i < equation.length() && Character.isDigit(equation.charAt(i))){
                    val = val * 10 + (Double.parseDouble(String.valueOf(equation.charAt(i))));
                    i++;
                }
                System.out.println(val);
                stack.push(val);
                eq.push(val+"");

            }

        }

//        1 + 2 * 3
//        1     2       3
//        return 0;
    }
    public double compUwu(){
        double first,second = 0;
        String value;
        System.out.println("dedaf");
        while(eq.size() != 1){
            value = eq.pop();
            if(value == "+"){
                first = Double.parseDouble(value);
                System.out.println(first+second+"aaa");
                eq.push((first+second)+"");
            }else{
                second = Double.parseDouble(value);
            }
        }
        return Double.parseDouble(eq.pop());
    }

    public double comp(){
        double first,second;
        char op;
        while(!operation.isEmpty()){
            op = operation.pop();
            System.out.println("a: "+op);
            switch(op){
                case '+':
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(first+second);
                    break;
                case '-':
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(first-second);
                    break;
                case '*':
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(first*second);
                    break;
                case '/':
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(first/second);
                    break;
            }
        }
        double res = stack.pop();
        System.out.println(res+"");
        return res;
    }
}
