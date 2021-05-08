package com.example.overflow;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button;
    private CheckBox RembrMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Login Button
        button = (Button) findViewById(R.id.LoginBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, HomeScreen.class);
                startActivity(intent);
            }
        });

        //RembrMe Checkbox
        RembrMe = findViewById(R.id.RememberMe);

        //Forgot Password

        //Sign Up
        final TextView signUp = this.findViewById(R.id.SignUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}