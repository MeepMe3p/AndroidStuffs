package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.AttachedSurfaceControl;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class PassingIntentsExercise extends AppCompatActivity {
    Button btnSubmit, btnClear;
    TextView tfEmail, tfFirstName, tfLastName,tfBirthdate,tfPhone,tfCity,tfCountry,tfSchool,tfWaifu;
    RadioButton rbMale, rbFemale, rbOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        rbMale = (RadioButton) findViewById(R.id.rbMale);
        rbFemale= findViewById(R.id.rbFemale);
        rbOthers= findViewById(R.id.rbOthers);
        tfFirstName = findViewById(R.id.tfFirstName);
        tfLastName = findViewById(R.id.tfLastName);
        tfEmail = findViewById(R.id.tfEmail);
        tfBirthdate = findViewById(R.id.tfBirthdate);
        tfCity = findViewById(R.id.tfCity);
        tfPhone = findViewById(R.id.tfPhone);
        tfCountry = findViewById(R.id.tfCountry);
        tfSchool = findViewById(R.id.tfSchool);
        tfWaifu = findViewById(R.id.tfWaifu);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = tfFirstName.getText().toString();
                String lname = tfLastName.getText().toString();
                String email = tfEmail.getText().toString();
                String birthdate = tfBirthdate.getText().toString();
                String city = tfCity.getText().toString();
                String phone = tfPhone.getText().toString();
                String country = tfCountry.getText().toString();
                String school = tfSchool.getText().toString();
                String waifu = tfWaifu.getText().toString();

                String gender;
                if(rbFemale.isChecked()){
                    gender = "female";
                }else if(rbMale.isChecked()){
                    gender = "male";
                }else{
                    gender = "others";
                }

            }
        });
        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tfEmail.setText("");
                tfFirstName.setText("");
                tfLastName.setText("");
                tfBirthdate.setText("");
                rbMale.setChecked(false);
                rbFemale.setChecked(false);
                rbOthers.setChecked(false);
                tfCity.setText("");
                tfPhone.setText("");
                tfCountry.setText("");
                tfSchool.setText("");
                tfWaifu.setText("");
            }
        });

    }
}