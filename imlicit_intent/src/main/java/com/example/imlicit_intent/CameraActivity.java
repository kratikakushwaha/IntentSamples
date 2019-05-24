package com.example.imlicit_intent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imlicit_two);
        findViewById(R.id.btn_camera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intentCamera);
            }
        });
    }
}
