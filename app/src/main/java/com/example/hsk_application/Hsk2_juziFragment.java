package com.example.hsk_application;
// YourFragment.java
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Locale;

public class Hsk2_juziFragment extends Fragment {

    String[] textlist;
    String[] textlist2;
    String[] textpinyin;

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hsk2_juzi, container, false);

        textlist = getResources().getStringArray(R.array.hsk2_juzi);
        textlist2 = getResources().getStringArray(R.array.hsk2_jufan);
        textpinyin = getResources().getStringArray(R.array.hsk2_juzipinyin);

        listView = view.findViewById(R.id.customlistview);
        CustomAdapter customAdapter = new CustomAdapter(getActivity().getApplication(), textlist,textlist2,textpinyin);
        listView.setAdapter(customAdapter);


        return view;
    }
}