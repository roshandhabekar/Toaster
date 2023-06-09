package com.example.toaster;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.toaster.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static String PACKAGE_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this,"show message here this toast comes from toaster");

        Toaster.captureEvent(false);

        PACKAGE_NAME = getApplicationContext().getPackageName();
        Toaster.setApplicationName(PACKAGE_NAME);

    }

}