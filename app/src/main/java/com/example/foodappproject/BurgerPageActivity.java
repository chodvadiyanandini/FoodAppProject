package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class BurgerPageActivity extends AppCompatActivity {
LinearLayout lypizza,lysushi,lypasta,lydrink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_page);
        initview();
    }

    private void initview() {
        lypizza=findViewById(R.id.lypizza);
        lysushi=findViewById(R.id.lysushi);
        lypasta=findViewById(R.id.lypasta);
        lydrink=findViewById(R.id.lydrink);
        lypizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(BurgerPageActivity.this,HomeScreenActivity.class);
                startActivity(i);
            }
        });
        lysushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(BurgerPageActivity.this,SushiPageActivity.class);
                startActivity(i);
            }
        });
        lypasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(BurgerPageActivity.this,PastaActivity.class);
                startActivity(i);
            }
        });
        lydrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(BurgerPageActivity.this,DrinkActivity.class);
                startActivity(i);
            }
        });
    }
}