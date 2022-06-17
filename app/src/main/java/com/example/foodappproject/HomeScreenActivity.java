package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeScreenActivity extends AppCompatActivity {
CircleImageView imgpizza1,imgpizza2,imgpizza3,imgpizza4,imgpizza5,imgpizza6,imgprofile;
LinearLayout lyburgerhome,lyburger,lysushi,lypasta,lydrink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        initview();
        show();
    }

    private void show() {
        lyburgerhome=findViewById(R.id.lyburgerhome);
        lyburger=findViewById(R.id.lyburger);
        lypasta=findViewById(R.id.lypasta);
        lysushi=findViewById(R.id.lysushi);
        lydrink=findViewById(R.id.lydrink);
        lyburgerhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,BurgerPageActivity.class);
                startActivity(i);
            }
        });
        lysushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,SushiPageActivity.class);
                startActivity(i);
            }
        });
        lypasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,PastaActivity.class);
                startActivity(i);
            }
        });
        lydrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,DrinkActivity.class);
                startActivity(i);
            }
        });
        lyburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,BurgerPageActivity.class);
                startActivity(i);
            }
        });
    }

    private void initview() {
        imgpizza1=findViewById(R.id.imgpizza1);
        imgpizza2=findViewById(R.id.imgpizza2);
        imgpizza3=findViewById(R.id.imgpizza3);
        imgpizza4=findViewById(R.id.imgpizza4);
        imgpizza5=findViewById(R.id.imgpizza5);
        imgpizza6=findViewById(R.id.imgpizza6);
        imgprofile=findViewById(R.id.imgprofile);
        imgpizza1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,MeantPizzaActivity.class);
                startActivity(i);
            }
        });
        imgpizza2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,CheesePizzaActivity.class);
                startActivity(i);
            }
        });
        imgpizza3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,MargheritaPizzaActivity.class);
                startActivity(i);
            }
        });
        imgpizza4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,FarmhousePizzaActivity.class);
                startActivity(i);
            }
        });
        imgpizza5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,PappyPaneerActivity.class);
                startActivity(i);
            }
        });
        imgpizza6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,PanerMakhanaActivity.class);
                startActivity(i);
            }
        });
        imgprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreenActivity.this,ProfilePageActivity.class);
                startActivity(i);
            }
        });
    }
}