package com.example.overflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ForgotPwd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pwd);

        //Account Type Drop-down
        Spinner mySpinner = (Spinner) findViewById(R.id.spinAccountType);

         ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(ForgotPwd.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.accountTypes));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Button buttonRetrievePassword = (Button) findViewById(R.id.retrievePassword);

        buttonRetrievePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPwd.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}