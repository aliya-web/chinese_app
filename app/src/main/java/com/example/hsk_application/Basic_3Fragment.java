package com.example.hsk_application;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import android.media.MediaPlayer;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

public class Basic_3Fragment extends Fragment {

    private TextToSpeech textToSpeech;

    private MediaPlayer mediaPlayer,pa1,pa2,pa3,pa4,pb1,pb2,pb3,pb4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_basic_3, container, false);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton a1 = view.findViewById(R.id.a1);
        a1.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton a2 = view.findViewById(R.id.a2);
        a2.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton a3 = view.findViewById(R.id.a3);
        a3.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton a4 = view.findViewById(R.id.a4);
        a4.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton b1 = view.findViewById(R.id.apb_b1);
        b1.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton b2 = view.findViewById(R.id.apb_b2);
        b2.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton b3 = view.findViewById(R.id.apb_b3);
        b3.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton b4 = view.findViewById(R.id.apb_b4);
        b4.setAllCaps(false);

//
        pa1 = MediaPlayer.create(getContext(), R.raw.a1); // Replace 'your_sound_file' with the actual file name
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pa1 != null) {
                    pa1.start();
                }
            }
        });
        pa2 = MediaPlayer.create(getContext(), R.raw.a2); // Replace 'your_sound_file' with the actual file name
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pa2 != null) {
                    pa2.start();
                }
            }
        });
        pa3 = MediaPlayer.create(getContext(), R.raw.a3); // Replace 'your_sound_file' with the actual file name
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pa3 != null) {
                    pa3.start();
                }
            }
        });
        pa4 = MediaPlayer.create(getContext(), R.raw.a4); // Replace 'your_sound_file' with the actual file name
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pa4 != null) {
                    pa4.start();
                }
            }
        });
        pb1 = MediaPlayer.create(getContext(), R.raw.ba1); // Replace 'your_sound_file' with the actual file name
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pb1 != null) {
                    pb1.start();
                }
            }
        });
        pb2 = MediaPlayer.create(getContext(), R.raw.ba2); // Replace 'your_sound_file' with the actual file name
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pb2 != null) {
                    pb2.start();
                }
            }
        });
        pb3 = MediaPlayer.create(getContext(), R.raw.ba3); // Replace 'your_sound_file' with the actual file name
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pb3 != null) {
                    pb3.start();
                }
            }
        });
        pb4 = MediaPlayer.create(getContext(), R.raw.ba4); // Replace 'your_sound_file' with the actual file name
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pb4 != null) {
                    pb4.start();
                }
            }
        });

        return view;
    }
}