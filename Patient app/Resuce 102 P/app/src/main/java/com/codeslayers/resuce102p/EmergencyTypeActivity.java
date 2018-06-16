package com.codeslayers.resuce102p;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EmergencyTypeActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView i1, i2, i3, i4, i5, i6;
    Button b1,b2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencytype);

        i1 = (ImageView) findViewById(R.id.headinjury);
        i2 = (ImageView) findViewById(R.id.heartattack);
        i3 = (ImageView) findViewById(R.id.pregnancy);
        i4 = (ImageView) findViewById(R.id.fire);
        i5 = (ImageView) findViewById(R.id.accident);
        i6 = (ImageView) findViewById(R.id.others);
        b2=  (Button) findViewById(R.id.buttonexittype) ;


        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
        i6.setOnClickListener(this);
        b2.setOnClickListener(this);

        t1=(TextView)findViewById(R.id.fortimecount);
        new CountDownTimer(7000, 1000) {

            public void onTick(long millisUntilFinished) {
                t1.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(),LocationActivity.class);
                startActivity(intent);
                System.exit(1);
            }
        }.start();

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            System.exit(1);
        }
        return false;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.headinjury)
        {

            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
            System.exit(1);

        }
        if (v.getId() == R.id.heartattack) {
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
            System.exit(1);
        }
        if (v.getId() == R.id.pregnancy) {
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
            System.exit(1);
        }
        if (v.getId() == R.id.fire) {
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
            System.exit(1);
        }
        if (v.getId() == R.id.accident) {
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
            System.exit(1);
        }
        if (v.getId() == R.id.others) {
            Intent i = new Intent(this, LocationActivity.class);
            startActivity(i);
            System.exit(1);
        }
        if (v.getId() == R.id. buttonexittype) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            System.exit(1);
        }
    }
}

