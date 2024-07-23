package com.example.hsk_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;


public class pinyin extends AppCompatActivity {
    FrameLayout frameLayout;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinyin);

        @SuppressLint("WrongViewCast") Toolbar toob=findViewById(R.id.toolbar);
        setSupportActionBar(toob);
        getSupportActionBar().setTitle("拼音(pinyin)");
        //
        // ປຸ່ມກັບຄື້ນ
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        ..............................................................

        frameLayout = findViewById(R.id.framelayout);
        tabLayout = findViewById(R.id.tablayout);

        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new BasicintroFragment())
//                .addToBackStack(null)
                .commit();


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()){
                    case 0:
                        fragment = new BasicintroFragment();
                        break;
                    case 1:
                        fragment = new Basic_1Fragment();
                        break;
                    case 2:
                        fragment = new Basic_2Fragment();
                        break;
                    case 3:
                        fragment = new Basic_3Fragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,fragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}