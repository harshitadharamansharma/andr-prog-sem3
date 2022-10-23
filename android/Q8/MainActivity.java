package com.example.anku.q8;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    RelativeLayout RL;
    Button B1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RL = (RelativeLayout)findViewById(R.id.Layout);
        B1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);

        B1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // APPLY YOUR COLOR CODE HERE
                RL.setBackgroundColor(Color.parseColor("#01ff90"));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // APPLY YOUR COLOR CODE HERE
                RL.setBackgroundColor(Color.parseColor("#BC8F8F"));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // APPLY YOUR COLOR CODE HERE
                RL.setBackgroundColor(Color.parseColor("#A9A9A9"));

            }
        });

    }
}