package com.example.hsk_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class number extends AppCompatActivity {
    String[] textlist;
    String[] textlist2;
    String[] textpinyin;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        @SuppressLint("WrongViewCast") Toolbar toob= this.<Toolbar>findViewById(R.id.toolbar);
        setSupportActionBar(toob);
        getSupportActionBar().setTitle("数字 ຕົວເລກ ");
        // ປຸ່ມກັບຄື້ນ
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        ..............................................................
        textlist = getResources().getStringArray(R.array.numbers);
        textlist2 = getResources().getStringArray(R.array.numbers_fanyi);
        textpinyin = getResources().getStringArray(R.array.numberspinyin);

        listView = findViewById(R.id.customlistview);
        CustomAdapter customAdapter = new CustomAdapter(getApplication(), textlist,textlist2,textpinyin);
        listView.setAdapter(customAdapter);
    }
}