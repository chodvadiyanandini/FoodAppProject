package com.example.foodappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AccountInformationActivity extends AppCompatActivity {
    EditText edtName, edtEmail, edtAddress, edtPhoneNumber,edtbirthdate;
    AppCompatButton btnsavechnges;
    ImageView imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_information);
        initview();
        back();
    }

    private void back() {
        imgback=findViewById(R.id.imgback);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(AccountInformationActivity.this,ProfilePageActivity.class);
                startActivity(i);
            }
        });
    }

    private void initview() {
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtAddress = findViewById(R.id.edtAddress);
        edtPhoneNumber = findViewById(R.id.edtPhoneNumber);
        btnsavechnges = findViewById(R.id.btnsavechnges);
        edtbirthdate = findViewById(R.id.edtbirthdate);
        btnsavechnges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = edtName.getText().toString();
                String mail = edtEmail.getText().toString();
                String add = edtAddress.getText().toString();
                String number = edtPhoneNumber.getText().toString();
                String bod = edtbirthdate.getText().toString();
                if (Name.isEmpty()) {
                    Toast.makeText(AccountInformationActivity.this, "Please enter your Name", Toast.LENGTH_SHORT).show();
                }
                else if(mail.isEmpty())
                {
                    Toast.makeText(AccountInformationActivity.this, "Please enter your Email", Toast.LENGTH_SHORT).show();
                }
                else if(add.isEmpty())
                {
                    Toast.makeText(AccountInformationActivity.this, "Please enter your Address", Toast.LENGTH_SHORT).show();
                }
                else if(number.isEmpty())
                {
                    Toast.makeText(AccountInformationActivity.this, "Please enter your Phone Number", Toast.LENGTH_SHORT).show();
                }
                else if(bod.isEmpty())
                {
                    Toast.makeText(AccountInformationActivity.this, "Please enter your birth date", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}