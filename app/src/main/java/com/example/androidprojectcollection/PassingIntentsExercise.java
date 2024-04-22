package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.AttachedSurfaceControl;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class PassingIntentsExercise extends AppCompatActivity {
    Button btnSubmit, btnClear;
    TextView tfEmail, tfFirstName, tfLastName,tfBirthdate,tfPhone,tfCity,tfCountry,tfSchool,tfWaifu,tfPet;
    RadioButton rbMale, rbFemale, rbOthers,rbYes,rbNo;

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

        rbYes = findViewById(R.id.rbYes);
        rbNo = findViewById(R.id.rbNo);

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

                String yesNo;
                String gender;
                if(rbFemale.isChecked()){
                    gender = "female";
                }else if(rbMale.isChecked()){
                    gender = "male";
                }else{
                    gender = "others";
                }
                if(rbYes.isChecked()){
                    yesNo = "yes";
                }else{
                    yesNo = "no";
                }

            Intent intent = new Intent(PassingIntentsExercise.this,PassingIntents2.class);
            intent.putExtra("fname",fname); intent.putExtra("lname",lname);
            intent.putExtra("email", email); intent.putExtra("birthdate",birthdate);
            intent.putExtra("city", city); intent.putExtra("phone",phone);
            intent.putExtra("country", country); intent.putExtra("school",school);
            intent.putExtra("gender",gender); intent.putExtra("yesNo",yesNo);
            intent.putExtra("waifu",waifu);
            startActivity(intent);

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
                rbYes.setChecked(false);
                rbNo.setChecked(false);
                tfCity.setText("");
                tfPhone.setText("");
                tfCountry.setText("");
                tfSchool.setText("");
                tfWaifu.setText("");
            }
        });


    }
}