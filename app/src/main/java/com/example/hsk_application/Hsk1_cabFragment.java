package com.example.hsk_application;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Hsk1_cabFragment extends Fragment {

    String[] textlist;
    String[] textlist2;
    String[] textpinyin;

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hsk1_cab, container, false);

        textlist = getResources().getStringArray(R.array.hsk1_cabhanzi);
        textlist2 = getResources().getStringArray(R.array.hsk1_cabfanyi);
        textpinyin = getResources().getStringArray(R.array.hsk1_cabpinyin);

        listView = view.findViewById(R.id.customlistview);
        CustomAdapter customAdapter = new CustomAdapter(getActivity().getApplication(), textlist,textlist2,textpinyin);
        listView.setAdapter(customAdapter);


        return view;
    }
}
