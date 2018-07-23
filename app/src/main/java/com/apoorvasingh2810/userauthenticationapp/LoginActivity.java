package com.apoorvasingh2810.userauthenticationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    String TAG="LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d(TAG,"Started");


        findViewById(R.id.textViewSignup).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.textViewSignup:

                startActivity(new Intent(this, SignupActivity.class));

                break;

        }

    }
}
