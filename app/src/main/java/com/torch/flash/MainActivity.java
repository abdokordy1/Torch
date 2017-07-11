package com.torch.flash;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Camera cam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void on (View v)

    {
        Camera cam = Camera.open(Camera.CameraInfo.CAMERA_FACING_BACK);
        Camera.Parameters p = cam.getParameters();
        p.setFlashMode(Camera.Parameters.FLASH_MODE_ON);
        cam.setParameters(p);
        cam.startPreview();
    }
}



