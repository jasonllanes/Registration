package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration_Activity extends AppCompatActivity {

    EditText etFirstName,etLastName,etEmail,etPassword,etConfirmPassword;
    Button btnCreate;

    public static final String EXTRA_MESSAGE = "com.example.registration.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);

        btnCreate = findViewById(R.id.btnCreate);




        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = etFirstName.getText().toString();
                String lastName = etLastName.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                String confirmPassword = etConfirmPassword.getText().toString();

                if(confirmPassword.equalsIgnoreCase(password)){
                    Intent intent = new Intent(Registration_Activity.this,Welcome_Activity.class);
                    intent.putExtra(EXTRA_MESSAGE,"Fullname: " + firstName + " " + lastName + "\n" +
                            "Email: " + email + "\n" +
                            "Password: " + password + "\n");
                    startActivity(intent);

                }else{
                    Toast.makeText(Registration_Activity.this, "Password doesn't match!", Toast.LENGTH_SHORT).show();
                }


            }
        });




    }
}