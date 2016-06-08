package com.example.osversion;

import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtV = (TextView) findViewById(R.id.txtV);
        txtV.setText("Your Android OS version:\n Android " + Build.VERSION.RELEASE + "\n"
                        + "API version: " + Build.VERSION.SDK_INT + "\n"
                        + "BRAND: " + Build.BRAND + "\n"
                        + "MODEL: " + Build.MODEL
        );
    }

}