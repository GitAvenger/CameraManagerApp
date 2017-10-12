package com.avenger.michael.CameraManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Michael on 04.10.2017.
 */

public class ActivityManagerCam2 extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_cam2);
    }

    public void ClickStop(View view)
    {
        Intent intent = new Intent(ActivityManagerCam2.this, ActivityManagerCam1.class);
        startActivity(intent);
    }
}
