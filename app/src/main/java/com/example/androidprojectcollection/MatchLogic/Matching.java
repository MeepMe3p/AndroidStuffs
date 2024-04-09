package com.example.androidprojectcollection.MatchLogic;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

public class Matching {
    Button[] buttonArray;
    int[]colors = new int[25];

    public Matching(Button[] buttonArray) {
        this.buttonArray = buttonArray;
    }
    Random randy = new Random();

    public void restart() {
        for(int i=0;i<buttonArray.length;i++){
            int ran = randy.nextInt(4);
            switch (ran){
                case 0:
                    buttonArray[i].setBackgroundColor(Color.BLUE);
                    colors[i] = 0;
                    break;
                case 1:
                    buttonArray[i].setBackgroundColor(Color.RED);
                    colors[i] = 1;
                    break;
                case 2:
                    buttonArray[i].setBackgroundColor(Color.YELLOW);
                    colors[i] = 2;
                    break;
                case 3:
                    buttonArray[i].setBackgroundColor(Color.GREEN);
                    colors[i] = 3;
                    break;
            }

        }
    }

    public void swap(Button btn, Button selectedButton,int pos) {
        ViewGroup parentView = (ViewGroup) btn.getParent();

        int index1 = parentView.indexOfChild(btn);
        int index2 = parentView.indexOfChild(selectedButton);

        parentView.removeView(btn);
        parentView.removeView(selectedButton);

        parentView.addView(btn, index2);
        parentView.addView(selectedButton, index1);
        System.out.println("Swappedd");


    }
    private int getBgColor(Button button) {
        Drawable background = button.getBackground();
        if (background instanceof ColorDrawable) {
            System.out.println(((ColorDrawable) background).getColor());
            return ((ColorDrawable) background).getColor();
        } else if (background instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            Drawable backgroundDrawable = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (backgroundDrawable instanceof ColorDrawable) {
                System.out.println("Fuck"+((ColorDrawable) background).getColor());

                return ((ColorDrawable) backgroundDrawable).getColor();
            }
        }
        return Color.TRANSPARENT;
    }

    public int[] getColors() {
        return colors;
    }
}
