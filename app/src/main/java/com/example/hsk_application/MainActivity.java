package com.example.hsk_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout home,about,favorite,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_page);
        menu = findViewById(R.id.menu);
        home = findViewById(R.id.home);
//        favorite = findViewById(R.id.like);
        about = findViewById(R.id.about);
        logout = findViewById(R.id.nav_logout);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer(drawerLayout);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });
//        favorite.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                rediractActivity(cardview.this, com.example.myproject.About.class);
//            }
//        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/"));
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();  // Clear all stored data
                editor.apply();
                Toast.makeText(MainActivity.this, "ອອກຈາກລະບົບ", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });
        //......................................................dashboard.........
        LinearLayout hsk1=findViewById(R.id.hsk1);
        hsk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
            public void openactivity2(){
                Intent intent = new Intent(MainActivity.this,hsk1.class);
                startActivity(intent);
            }
        });
        LinearLayout hsk2=findViewById(R.id.hsk2);
        hsk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
            public void openactivity2(){
                Intent intent = new Intent(MainActivity.this,hsk2.class);
                startActivity(intent);
            }
        });
        LinearLayout hsk3=findViewById(R.id.hsk3);
        hsk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
            public void openactivity2(){
                Intent intent = new Intent(MainActivity.this,hsk3.class);
                startActivity(intent);
            }
        });
        LinearLayout hsk4=findViewById(R.id.hsk4);
        hsk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
            public void openactivity2(){
                Intent intent = new Intent(MainActivity.this,hsk4.class);
                startActivity(intent);
            }
        });

//        ............................................
        LinearLayout basictext = findViewById(R.id.basicpinyin);
        basictext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
            public void openactivity1(){
                Intent intent = new Intent(MainActivity.this,pinyin.class);
                startActivity(intent);
            }
        });
        LinearLayout color = findViewById(R.id.color);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
            public void openactivity1(){
                Intent intent = new Intent(MainActivity.this,color.class);
                startActivity(intent);
            }
        });
        LinearLayout number = findViewById(R.id.number);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
            public void openactivity1(){
                Intent intent = new Intent(MainActivity.this,number.class);
                startActivity(intent);
            }
        });
        LinearLayout fruits = findViewById(R.id.fruits);
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
            public void openactivity1(){
                Intent intent = new Intent(MainActivity.this,fruits.class);
                startActivity(intent);
            }
        });
        LinearLayout family = findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
            public void openactivity1(){
                Intent intent = new Intent(MainActivity.this,family.class);
                startActivity(intent);
            }
        });
        LinearLayout animal = findViewById(R.id.animal);
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
            public void openactivity1(){
                Intent intent = new Intent(MainActivity.this,animal.class);
                startActivity(intent);
            }
        });
    }
    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public static void closeDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public static void rediractActivity(Activity activity, Class secondActivity){
        Intent intent = new Intent(activity, secondActivity);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }
}