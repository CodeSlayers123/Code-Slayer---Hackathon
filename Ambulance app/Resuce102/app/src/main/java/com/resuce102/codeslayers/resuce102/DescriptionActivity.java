package com.resuce102.codeslayers.resuce102;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DescriptionActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "DescriptionActivity";

    //widgets
    private Button mSumbit;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_description);
        Log.d(TAG, "onCreate: started");

        mSumbit = (Button)findViewById(R.id.sumbit);
        mSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DescriptionActivity.this,SucessActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
