package com.example.agricultureshop;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FarmerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_login);

        TextView farmer = findViewById(R.id.farmerTXT);
        EditText pwd = findViewById(R.id.farmerET);


        Button login = findViewById(R.id.farmerLoginBTN);
        login.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                String farmerInStr=farmer.getText().toString();
                String pwdInStr = pwd.getText().toString();
                if (farmerInStr.equals(("android")) && pwdInStr.equals("project")) {
                    Intent ini = new Intent(FarmerLoginActivity.this, FarmerActivity.class);
                    startActivity(ini);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Enter valid credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}