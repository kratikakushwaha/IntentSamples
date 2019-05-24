package com.example.flag_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FlagActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_one);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openActivity = new Intent(FlagActivityThree.this, FlagActivityFour.class);
                openActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(openActivity);
            }
        });
    }
}
