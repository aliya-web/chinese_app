package com.example.hsk_application;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String textlist[];
    String textlist2[];
    String textpinyin[];
    LayoutInflater inflater;

    TextToSpeech textToSpeech;
    public CustomAdapter(Context ctx, String[] texts,String[] text2, String[] pinyins){
        this.context = ctx;
        this.textlist = texts;
        this.textlist2 = text2;
        this.textpinyin = pinyins;
        inflater = LayoutInflater.from(ctx);

        textToSpeech = new TextToSpeech(context, status -> {
            if (status != TextToSpeech.ERROR) {
                textToSpeech.setLanguage(Locale.CHINA);
            }
        });

    }

    @Override
    public int getCount() {
        return textlist2.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.customlistview,null);
        TextView txtview = (TextView) convertView.findViewById(R.id.textview);
        TextView txtview2 = (TextView) convertView.findViewById(R.id.textview2);
        TextView txtpinyin = (TextView) convertView.findViewById(R.id.textpinyin);

        Button spker = (Button) convertView.findViewById(R.id.spkbtn);

        txtview.setText(textlist[position]);
        txtview2.setText(textlist2[position]);
        txtpinyin.setText(textpinyin[position]);

        spker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak(textlist[position]);
//                speak(textlist2[position]);
            }
        });


        return convertView;
    }
    private void speak(String text) {
        // Speak the text
        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
    }
}


