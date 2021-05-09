package com.example.overflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Account Type Drop-down
        Spinner mySpinner = (Spinner) findViewById(R.id.accountType);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SignUp.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.accountTypes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }
}