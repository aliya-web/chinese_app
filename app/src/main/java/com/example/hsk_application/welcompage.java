package com.example.hsk_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcompage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcompage);

        Button btn = findViewById(R.id.wel_btn);
        btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openactivity2();
           }
           public void openactivity2(){
               Intent intent = new Intent(welcompage.this,MainActivity.class);
               startActivity(intent);
           }
       });
    }
}