package com.askzeusapp.weatherask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        configureLogin();
    }
    private void configureLogin() {
         Button Login = (Button) findViewById(R.id.Login);
         Login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(loginpage.this, MainActivity.class));
             }
         });
    }
}