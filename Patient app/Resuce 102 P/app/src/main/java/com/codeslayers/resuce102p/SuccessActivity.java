package com.codeslayers.resuce102p;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SuccessActivity extends AppCompatActivity {


    private static final String TAG = "SuccessActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_success);
        Log.d(TAG, "onCreate: started");

    }
}
