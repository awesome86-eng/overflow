package com.example.overflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    public Button button;
    private CheckBox RembrMe;

    public void displayToast(View v){
        Toast.makeText(SignUp.this,"Registration Successful",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Successful Registry Button


        //Sign up Button
        button = (Button) findViewById(R.id.signup);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (SignUp.this, HomeScreen.class);
                startActivity(intent);
            }
        });


        //Account Type Drop-down
        Spinner mySpinner = (Spinner) findViewById(R.id.accountType);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SignUp.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.accountTypes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }

}