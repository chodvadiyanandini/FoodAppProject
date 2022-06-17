package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PastaActivity extends AppCompatActivity {
LinearLayout lypizza,lyburger,lysushi,lydrink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);
        initview();
    }

    private void initview() {
        lypizza=findViewById(R.id.lypizza);
        lyburger=findViewById(R.id.lyburger);
        lysushi=findViewById(R.id.lysushi);
        lydrink=findViewById(R.id.lydrink);
        lypizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PastaActivity.this,HomeScreenActivity.class);
                startActivity(i);
            }
        });
        lyburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PastaActivity.this,BurgerPageActivity.class);
                startActivity(i);
            }
        });
        lysushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PastaActivity.this,SushiPageActivity.class);
                startActivity(i);
            }
        });
        lydrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PastaActivity.this,DrinkActivity.class);
                startActivity(i);
            }
        });
    }
}