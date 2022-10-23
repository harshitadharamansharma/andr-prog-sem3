package com.example.anku.q3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView)findViewById(R.id.textView11);
        t2=(TextView)findViewById(R.id.textView13);
        t3=(TextView)findViewById(R.id.textView15);
        t4=(TextView)findViewById(R.id.textView17);
        t5=(TextView)findViewById(R.id.textView19);
        t6=(TextView)findViewById(R.id.textView21);
        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        String lName = intent.getStringExtra("lname");
        String age = intent.getStringExtra("age");
        String course = intent.getStringExtra("course");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");

        t1.setText(fName);

        t2.setText(lName);
        t3.setText(age);
        t4.setText(course);
        t5.setText(email);
        t6.setText(phone);
    }

}
