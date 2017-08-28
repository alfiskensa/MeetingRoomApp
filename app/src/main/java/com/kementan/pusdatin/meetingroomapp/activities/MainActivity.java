package com.kementan.pusdatin.meetingroomapp.activities;
import com.kementan.pusdatin.meetingroomapp.helper.SharedPrefManager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kementan.pusdatin.meetingroomapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, HomeActivity.class));
        }else{
            startActivity(new Intent(this, LoginActivity.class));
        }
    }
}
