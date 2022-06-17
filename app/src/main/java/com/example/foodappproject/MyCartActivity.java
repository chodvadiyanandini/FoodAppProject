package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyCartActivity extends AppCompatActivity {
AppCompatButton btncart;
ImageView imgback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);
        initview();
    }

    private void initview() {
        imgback=findViewById(R.id.imgback);
        btncart=findViewById(R.id.btncart);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MyCartActivity.this,ProfilePageActivity.class);
                startActivity(i);
            }
        });
        btncart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MyCartActivity.this,ProfilePageActivity.class);
                startActivity(i);
            }
        });
    }
}