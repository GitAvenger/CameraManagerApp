package com.avenger.michael.CameraManager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EnterClick(View view)
    {
        if(Constant.EnabledCam == true)
        {
            Intent intent = new Intent(MainActivity.this, ActivityManagerCam1.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(MainActivity.this, ActivityManagerCam2.class);
            startActivity(intent);
        }
    }
}

