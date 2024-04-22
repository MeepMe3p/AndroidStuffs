package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.mItemChange){
            Toast.makeText(this,"Edit Object Item is clicked,",Toast.LENGTH_LONG).show();
        }else if(item.getItemId() == R.id.mItemReset){
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.mItemExit){
            finish();
        }

        return true;
    }

}