package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome_Activity extends AppCompatActivity {

    TextView tvCredentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String credentials = intent.getStringExtra(Registration_Activity.EXTRA_MESSAGE);


        tvCredentials  = findViewById(R.id.tvCredentials);

        tvCredentials.setText("Welcome new user! \n\n" + credentials);


    }
}