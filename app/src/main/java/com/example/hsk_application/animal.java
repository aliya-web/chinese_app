package com.example.hsk_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

public class animal extends AppCompatActivity {

    String[] textlist;
    String[] textlist2;
    String[] textpinyin;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        @SuppressLint("WrongViewCast") Toolbar toob= this.<Toolbar>findViewById(R.id.toolbar);
        setSupportActionBar(toob);
        getSupportActionBar().setTitle("动物 ສັດຕ່າງໆ ");
        //
        // ປຸ່ມກັບຄື້ນ
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        ..............................................................

        textlist = getResources().getStringArray(R.array.animals);
        textlist2 = getResources().getStringArray(R.array.animals_fanyi);
        textpinyin = getResources().getStringArray(R.array.animalspinyin);

        listView = findViewById(R.id.customlistview);
        CustomAdapter customAdapter = new CustomAdapter(getApplication(), textlist,textlist2,textpinyin);
        listView.setAdapter(customAdapter);
    }
}