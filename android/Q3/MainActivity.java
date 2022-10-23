package com.example.anku.q3;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText e1, e2, e3, e4, e5, e6;
    Button b = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText7);
        e2 = (EditText) findViewById(R.id.editText8);
        e3 = (EditText) findViewById(R.id.editText9);
        e4 = (EditText) findViewById(R.id.editText10);
        e5 = (EditText) findViewById(R.id.editText11);
        e6 = (EditText) findViewById(R.id.editText12);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("fname", e1.getText().toString());
        intent.putExtra("lname", e2.getText().toString());
        intent.putExtra("age", e3.getText().toString());
        intent.putExtra("course", e4.getText().toString());
        intent.putExtra("email", e5.getText().toString());
        intent.putExtra("phone", e6.getText().toString());
        startActivity(intent);
    }
}