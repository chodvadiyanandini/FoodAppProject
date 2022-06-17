package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DrinkActivity extends AppCompatActivity {
LinearLayout lypizza,lyburger,lysushi,lypasta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        initview();
    }

    private void initview() {
        lypizza=findViewById(R.id.lypizza);
        lyburger=findViewById(R.id.lyburger);
        lysushi=findViewById(R.id.lysushi);
        lypasta=findViewById(R.id.lypasta);
        lypizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DrinkActivity.this,HomeScreenActivity.class);
                startActivity(i);
            }
        });
        lyburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DrinkActivity.this,BurgerPageActivity.class);
                startActivity(i);
            }
        });
        lysushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DrinkActivity.this,SushiPageActivity.class);
                startActivity(i);
            }
        });
        lypasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DrinkActivity.this,PastaActivity.class);
                startActivity(i);
            }
        });
    }
}