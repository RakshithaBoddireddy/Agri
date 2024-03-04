package com.example.agricultureshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button farmerBTN = findViewById(R.id.FarmerNavigateBTN);
        Button userBTN = findViewById(R.id.UserNavigateBTN);

        farmerBTN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ini1 = new Intent(MainActivity.this, FarmerLoginActivity.class);
                startActivity(ini1);
            }
        });

        userBTN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ini2 = new Intent(MainActivity.this, UserLoginActivity.class);
                startActivity(ini2);
            }
        });
    }
}