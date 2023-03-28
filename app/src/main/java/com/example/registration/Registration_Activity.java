package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration_Activity extends AppCompatActivity {

    EditText etFullname,etEmail,etPassword;
    Button btnCreate;

    public static final String EXTRA_MESSAGE = "com.example.registration.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFullname = findViewById(R.id.etFullname);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        btnCreate = findViewById(R.id.btnCreate);




        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname = etFullname.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                Intent intent = new Intent(Registration_Activity.this,Welcome_Activity.class);
                intent.putExtra(EXTRA_MESSAGE,"Fullname: " + fullname + "\n" +
                        "Email: " + email + "\n" +
                        "Password: " + password + "\n");
                startActivity(intent);

            }
        });




    }
}