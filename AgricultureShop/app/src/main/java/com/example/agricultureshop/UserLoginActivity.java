package com.example.agrishop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UserLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        TextView user = findViewById(R.id.userTXT);

        EditText pwd = findViewById(R.id.userPWDTXT);


        Button login = findViewById(R.id.userLoginBTN);
        login.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                String userInStr=user.getText().toString();
                String pwdInStr = pwd.getText().toString();
                if (userInStr.equals(("android")) && pwdInStr.equals("project")) {
                    Intent ini = new Intent(UserLoginActivity.this, UserActivity.class);
                    startActivity(ini);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Enter valid credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}