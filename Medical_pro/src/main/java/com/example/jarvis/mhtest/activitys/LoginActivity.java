package com.example.jarvis.mhtest.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jarvis.mhtest.R;
import com.example.jarvis.mhtest.SplashScreen;

public class LoginActivity extends AppCompatActivity {
    TextView regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        regbtn=(TextView)findViewById(R.id.RegBtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(i);
            }
        });
    }
}
