package com.example.anku.radioq7;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
      RadioGroup rr=null;
    RadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.t1);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
        r3=(RadioButton)findViewById(R.id.r3);
        r4=(RadioButton)findViewById(R.id.r4);
        r5=(RadioButton)findViewById(R.id.r5);
        r6=(RadioButton)findViewById(R.id.r6);
        r7=(RadioButton)findViewById(R.id.r7);
        r8=(RadioButton)findViewById(R.id.r8);
        r9=(RadioButton)findViewById(R.id.r9);
        rr=(RadioGroup)findViewById(R.id.radio_group1);
        rr.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup,int i) {
        if(i==r1.getId())
            tv.setText("Dr. Uma Chaudhry");
        if(i==r2.getId())
            tv.setText("Ms. Manu Kataria");
        if(i==r3.getId())
            tv.setText("Dr. Manoj Kumar Khanna");
        if(i==r4.getId())
            tv.setText("Dr. Anand Bharadvaja");
        if(i==r5.getId())
            tv.setText("Dr. Saroj Kumar Shukla");
        if(i==r6.getId())
            tv.setText("Dr. Rizwana");
        if(i==r7.getId())
            tv.setText("Dr. Lalit Kapur");
        if(i==r8.getId())
            tv.setText("Dr. Geeta Bhatt");
        if(i==r9.getId())
            tv.setText("Dr. Neeru Sharma");

    }
}
