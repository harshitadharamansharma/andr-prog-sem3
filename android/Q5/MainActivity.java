package com.example.anku.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
   Spinner sp;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        im=(ImageView)findViewById(R.id.imageView);
        sp.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                if(sp.getSelectedItemId()==0)
                {
                    im.setImageResource(R.drawable.image1);
                }
                if(sp.getSelectedItemId()==1)
                {
                    im.setImageResource(R.drawable.image2);
                }
                if(sp.getSelectedItemId()==2)
                {
                    im.setImageResource(R.drawable.image3);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //do nothing
            }
        });
    }
}
