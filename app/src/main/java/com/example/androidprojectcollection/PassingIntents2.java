package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntents2 extends AppCompatActivity {
    TextView tvFname, tvLname,tvGender,tvBirthdate,tvEmail,tvPhone,tvCity,tvCountry,tvSchool,tvWaifu,tvYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents2);

        tvFname = findViewById(R.id.tvFname);   tvLname = findViewById(R.id.tvLname);
        tvGender = findViewById(R.id.tvGender);   tvBirthdate = findViewById(R.id.tvBday);
        tvEmail = findViewById(R.id.tvEmail);   tvPhone = findViewById(R.id.tvPhone);
        tvCity = findViewById(R.id.tvCity);   tvCountry = findViewById(R.id.tvCountry);
        tvSchool = findViewById(R.id.tcSchool);   tvWaifu = findViewById(R.id.tvWaifu);
        tvYesNo = findViewById(R.id.tvYesNo);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname");      String lname = intent.getStringExtra("lname");
        String gender = intent.getStringExtra("gender");    String email = intent.getStringExtra("email");
        String bday = intent.getStringExtra("birthdate");   String city = intent.getStringExtra("city");
        String phone = intent.getStringExtra("phone");      String waifu = intent.getStringExtra("waifu");
        String school = intent.getStringExtra("school");      String country = intent.getStringExtra("country");
        String yesNo = intent.getStringExtra("yesNo");

        tvFname.setText(fname);     tvLname.setText(lname);     tvGender.setText(gender);
        tvEmail.setText(email);     tvBirthdate.setText(bday);  tvCity.setText(city);
        tvPhone.setText(phone);     tvWaifu.setText(waifu);     tvSchool.setText(school);
        tvCountry.setText(country); tvYesNo.setText(yesNo);

        Button btnBack = findViewById(R.id.btnBackPsInt);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PassingIntents2.this,PassingIntentsExercise.class);
                startActivity(intent);
            }
        });


    }
}