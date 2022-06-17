package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileEditingActivity extends AppCompatActivity {
ImageView imgback;
AppCompatButton btnsavechnges;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_editing);
        initview();
    }

    private void initview() {
        imgback=findViewById(R.id.imgback);
        btnsavechnges=findViewById(R.id.btnsavechnges);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProfileEditingActivity.this,ProfilePageActivity.class);
                startActivity(i);
            }
        });
        btnsavechnges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProfileEditingActivity.this,ProfilePageActivity.class);
                startActivity(i);
            }
        });
    }
}