package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExplicitIntentOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent_one);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openActivity=new Intent(ExplicitIntentOne.this,ExplicitIntentTwo.class);
                startActivity(openActivity);
            }
        });

    }
}
