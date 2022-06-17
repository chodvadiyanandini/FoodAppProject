package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ProfilePageActivity extends AppCompatActivity {
ImageView imgprofile,imgback;
LinearLayout lymycart,lyaddress,accountinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        initview();
    }

    private void initview() {
        accountinfo=findViewById(R.id.accountinfo);
        imgprofile=findViewById(R.id.imgprofile);
        lyaddress=findViewById(R.id.lyaddress);
        lymycart=findViewById(R.id.lymycart);
        imgback=findViewById(R.id.imgback);
        accountinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProfilePageActivity.this,AccountInformationActivity.class);
                startActivity(i);
            }
        });
        imgprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProfilePageActivity.this,ProfileEditingActivity.class);
                startActivity(i);
            }
        });
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProfilePageActivity.this,HomeScreenActivity.class);
                startActivity(i);
            }
        });
        lyaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProfilePageActivity.this,SavedAddressActivity.class);
                startActivity(i);
            }
        });
        lymycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProfilePageActivity.this,MyCartActivity.class);
                startActivity(i);
            }
        });

    }
}