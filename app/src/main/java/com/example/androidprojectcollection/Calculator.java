package com.example.androidprojectcollection;

import android.widget.Toast;

import java.util.Stack;

public class Calculator {
    public String equation;
    Stack<Double> stack = new Stack<>();
    Stack<Character> operation = new Stack<>();
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
    public double calcBottom(){
        switch(sec){
            case '+':
                bottom_ans+=first;
                break;

            case '-':
                bottom_ans-=first;
                break;
            case '*':
                bottom_ans*=first;
                break;
            case '/':
                bottom_ans/=first;
                break;

        }
        return bottom_ans;
    }

    public double getBottom_ans() {
        return bottom_ans;
    }

    public void setBottom_ans(double bottom_ans) {
        this.bottom_ans = bottom_ans;
    }

    public void magic(){
        System.out.println(equation);
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

            }

        }

//        1 + 2 * 3
//        1     2       3
//        return 0;
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
