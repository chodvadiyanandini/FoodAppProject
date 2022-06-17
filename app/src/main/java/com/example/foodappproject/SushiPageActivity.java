package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SushiPageActivity extends AppCompatActivity {
LinearLayout lypizza,lyburger,lypasta,lydrink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushi_page);
        initview();
    }

    private void initview() {
        lypizza=findViewById(R.id.lypizza);
        lyburger=findViewById(R.id.lyburger);
        lypasta=findViewById(R.id.lypasta);
        lydrink=findViewById(R.id.lydrink);
        lypizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SushiPageActivity.this,HomeScreenActivity.class);
                startActivity(i);
            }
        });
        lyburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SushiPageActivity.this,BurgerPageActivity.class);
                startActivity(i);
            }
        });
        lypasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SushiPageActivity.this,PastaActivity.class);
                startActivity(i);
            }
        });
        lydrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SushiPageActivity.this,DrinkActivity.class);
                startActivity(i);
            }
        });
    }
}