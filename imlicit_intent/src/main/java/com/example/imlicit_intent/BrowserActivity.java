package com.example.imlicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imlicit_three);
        findViewById(R.id.btn_browser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(myIntent);
            }
        });
    }
}

