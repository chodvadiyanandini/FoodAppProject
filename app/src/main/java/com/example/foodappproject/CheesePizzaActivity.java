package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CheesePizzaActivity extends AppCompatActivity {
ImageView imgback;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheese_pizza);
        initview();
    }

    private void initview() {
        imgback=findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CheesePizzaActivity.this,HomeScreenActivity.class);
                startActivity(i);
            }
        });
    }
}