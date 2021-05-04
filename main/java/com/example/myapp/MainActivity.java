package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onbtnclick (View view) {
        TextView txtfirst = findViewById(R.id.firstview) ;
        EditText edt =  findViewById(R.id.firstName);
        txtfirst.setText(txtfirst.getText().toString()+ "  "  + edt.getText().toString());

        txtfirst = findViewById(R.id.lastview);
        edt = findViewById(R.id.lastName);
        txtfirst.setText(txtfirst.getText().toString() + "  " + edt.getText().toString());

        txtfirst = findViewById(R.id.emailview);
        edt = findViewById(R.id.email);
        txtfirst.setText(txtfirst.getText().toString() + "  " + edt.getText().toString());

    }
}