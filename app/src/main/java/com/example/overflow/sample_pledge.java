package com.example.overflow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.overflow.ui.cart.CartFragment;

public class sample_pledge extends AppCompatActivity {
    //vars
    public Button add2Cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_pledge);

        //Add to Cart Button
        add2Cart = (Button) findViewById(R.id.cartButton);

        add2Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sample_pledge.this, CartFragment.class);
                startActivity(intent);
            }
        });
    }
}

