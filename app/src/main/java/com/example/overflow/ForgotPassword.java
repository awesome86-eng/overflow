package com.example.overflow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {
    public Button button;
    private CheckBox RembrMe;

    //Successfully sent email Button
    public void displayToast(View v){
        Toast.makeText(ForgotPassword.this,"Successfully sent email",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);




        //Account Type Drop-down
        Spinner mySpinner = (Spinner) findViewById(R.id.accountType);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(ForgotPassword.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.accountTypes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }

}

