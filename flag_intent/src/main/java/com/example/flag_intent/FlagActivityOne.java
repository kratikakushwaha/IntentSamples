package com.example.flag_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class FlagActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_one);
        Intent openActivity=new Intent(FlagActivityOne.this,FlagActivityTwo.class);
        startActivity(openActivity);
    }
}
