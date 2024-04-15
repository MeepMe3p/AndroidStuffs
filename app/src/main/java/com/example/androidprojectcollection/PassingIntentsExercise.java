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
    TextView tfEmail, tfFirstName, tfLastName,tfBirthdate;
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

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = tfFirstName.getText().toString();
                String lname = tfLastName.getText().toString();
                String email = tfEmail.getText().toString();
                String birthdate = tfBirthdate.getText().toString();

                String gender;
//                if()

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
            }
        });

    }
}