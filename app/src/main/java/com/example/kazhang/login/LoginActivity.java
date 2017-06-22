package com.example.kazhang.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onSignupClickListener(View v){
        Toast.makeText(this, "Sign up clicked", Toast.LENGTH_SHORT).show();
    }

    public void onForgotClickListener(View v){
        Toast.makeText(this, "Forgot password clicked", Toast.LENGTH_SHORT).show();
    }

    public void onDotsClickListener(View v){
        Toast.makeText(this, "Dots clicked", Toast.LENGTH_SHORT).show();
    }

    public void onEyeClickListener(View v){
        Toast.makeText(this, "Eye clicked", Toast.LENGTH_SHORT).show();
    }

    public void onLoginClickListener(View v){
        Toast.makeText(this, "Login clicked", Toast.LENGTH_SHORT).show();
    }
}
