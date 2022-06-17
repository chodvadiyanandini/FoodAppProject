package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CommitmentActivity extends AppCompatActivity {
ImageView imgnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commitment);
        initview();
    }

    private void initview() {
        imgnext=findViewById(R.id.imgnext);
        imgnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CommitmentActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}