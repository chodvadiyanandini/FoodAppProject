package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SavedAddressActivity extends AppCompatActivity {
AppCompatButton btnsave,btnmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_address);
        initview();
    }

    private void initview() {
        btnsave=findViewById(R.id.btnsave);
        btnmap=findViewById(R.id.btnmap);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SavedAddressActivity.this,ProfilePageActivity.class);
                startActivity(i);
            }
        });
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SavedAddressActivity.this,MapLocationActivity.class);
                startActivity(i);
            }
        });
    }
}