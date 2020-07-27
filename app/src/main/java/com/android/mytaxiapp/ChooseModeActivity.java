package com.android.mytaxiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class ChooseModeActivity extends AppCompatActivity {

    Button passengerButton;
    Button driverButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode);

        passengerButton = findViewById(R.id.passengerButton);
        driverButton = findViewById(R.id.driverButton);

        passengerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseModeActivity.this, PassengerSignUpLogInActivity.class));
            }
        });

        driverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseModeActivity.this, DriverSignUpLogInActivity.class));
            }
        });
    }
}
