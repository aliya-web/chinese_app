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

public class Basic_2Fragment extends Fragment {

    private TextToSpeech textToSpeech;

    private MediaPlayer mediaPlayer,pa,pai,pao,pan,pang,po,pou,pong,pe,pei,pen,peng,per,pi,pia,piao,pian,piang,pie,piu,pin,ping,piong,pu,pua,puai,puan,puang,puo,pui,pun,puu,puue,puuan,puun;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_basic_2, container, false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton a = view.findViewById(R.id.apb_a);
        a.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ai = view.findViewById(R.id.apb_ai);
        ai.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ao = view.findViewById(R.id.apb_ao);
        ao.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton an = view.findViewById(R.id.apb_an);
        an.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ang = view.findViewById(R.id.apb_ang);
        ang.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton o = view.findViewById(R.id.apb_o);
        o.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ou = view.findViewById(R.id.apb_ou);
        ou.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ong = view.findViewById(R.id.apb_ong);
        ong.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton e = view.findViewById(R.id.apb_e);
        e.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ei = view.findViewById(R.id.apb_ei);
        ei.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton en = view.findViewById(R.id.apb_en);
        en.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton eng = view.findViewById(R.id.apb_eng);
        eng.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton er = view.findViewById(R.id.apb_er);
        er.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton i = view.findViewById(R.id.apb_i);
        i.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ia = view.findViewById(R.id.apb_ia);
        ia.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton iao = view.findViewById(R.id.apb_iao);
        iao.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ian = view.findViewById(R.id.apb_ian);
        ian.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton iang = view.findViewById(R.id.apb_iang);
        iang.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ie = view.findViewById(R.id.apb_ie);
        ie.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton iu = view.findViewById(R.id.apb_iu);
        iu.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton in = view.findViewById(R.id.apb_in);
        in.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ing = view.findViewById(R.id.apb_ing);
        ing.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton iong = view.findViewById(R.id.apb_iong);
        iong.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton u = view.findViewById(R.id.apb_u);
        u.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ua = view.findViewById(R.id.apb_ua);
        ua.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton uai = view.findViewById(R.id.apb_uai);
        uai.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton uan = view.findViewById(R.id.apb_uan);
        uan.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton uang = view.findViewById(R.id.apb_uang);
        uang.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton uo = view.findViewById(R.id.apb_uo);
        uo.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ui = view.findViewById(R.id.apb_ui);
        ui.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton un = view.findViewById(R.id.apb_un);
        un.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton uu = view.findViewById(R.id.apb_uu);
        uu.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton uue = view.findViewById(R.id.apb_uue);
        uue.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton uuan = view.findViewById(R.id.apb_uuan);
        uuan.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton uun = view.findViewById(R.id.apb_uun);
        uun.setAllCaps(false);



        pa = MediaPlayer.create(getContext(), R.raw.a); // Replace 'your_sound_file' with the actual file name
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pa != null) {
                    pa.start();
                }
            }
        });
        pai = MediaPlayer.create(getContext(), R.raw.ai); // Replace 'your_sound_file' with the actual file name
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pai != null) {
                    pai.start();
                }
            }
        });
        pao = MediaPlayer.create(getContext(), R.raw.ao); // Replace 'your_sound_file' with the actual file name
        ao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pao != null) {
                    pao.start();
                }
            }
        });
        pan = MediaPlayer.create(getContext(), R.raw.an); // Replace 'your_sound_file' with the actual file name
        an.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pan != null) {
                    pan.start();
                }
            }
        });
        pang = MediaPlayer.create(getContext(), R.raw.ang); // Replace 'your_sound_file' with the actual file name
        ang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pang != null) {
                    pang.start();
                }
            }
        });
        po = MediaPlayer.create(getContext(), R.raw.o); // Replace 'your_sound_file' with the actual file name
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (po != null) {
                    po.start();
                }
            }
        });
        pou = MediaPlayer.create(getContext(), R.raw.ou); // Replace 'your_sound_file' with the actual file name
        ou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pou != null) {
                    pou.start();
                }
            }
        });
        pong = MediaPlayer.create(getContext(), R.raw.ong); // Replace 'your_sound_file' with the actual file name
        ong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pong != null) {
                    pong.start();
                }
            }
        });
        pe = MediaPlayer.create(getContext(), R.raw.e); // Replace 'your_sound_file' with the actual file name
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pe != null) {
                    pe.start();
                }
            }
        });
        pei = MediaPlayer.create(getContext(), R.raw.ei1); // Replace 'your_sound_file' with the actual file name
        ei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pei != null) {
                    pei.start();
                }
            }
        });
        pen = MediaPlayer.create(getContext(), R.raw.en); // Replace 'your_sound_file' with the actual file name
        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pen != null) {
                    pen.start();
                }
            }
        });
        peng = MediaPlayer.create(getContext(), R.raw.eng); // Replace 'your_sound_file' with the actual file name
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (peng != null) {
                    peng.start();
                }
            }
        });
        per = MediaPlayer.create(getContext(), R.raw.er); // Replace 'your_sound_file' with the actual file name
        er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (per != null) {
                    per.start();
                }
            }
        });
        pi = MediaPlayer.create(getContext(), R.raw.yi); // Replace 'your_sound_file' with the actual file name
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pi != null) {
                    pi.start();
                }
            }
        });
        pia = MediaPlayer.create(getContext(), R.raw.ia); // Replace 'your_sound_file' with the actual file name
        ia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pia != null) {
                    pia.start();
                }
            }
        });
        piao = MediaPlayer.create(getContext(), R.raw.iao); // Replace 'your_sound_file' with the actual file name
        iao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (piao != null) {
                    piao.start();
                }
            }
        });
        pian = MediaPlayer.create(getContext(), R.raw.ian); // Replace 'your_sound_file' with the actual file name
        ian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pian != null) {
                    pian.start();
                }
            }
        });
        piang = MediaPlayer.create(getContext(), R.raw.iang); // Replace 'your_sound_file' with the actual file name
        iang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (piang != null) {
                    piang.start();
                }
            }
        });
        pie = MediaPlayer.create(getContext(), R.raw.ie); // Replace 'your_sound_file' with the actual file name
        ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pie != null) {
                    pie.start();
                }
            }
        });
        piu = MediaPlayer.create(getContext(), R.raw.iu); // Replace 'your_sound_file' with the actual file name
        iu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (piu != null) {
                    piu.start();
                }
            }
        });
        pin = MediaPlayer.create(getContext(), R.raw.in); // Replace 'your_sound_file' with the actual file name
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pin != null) {
                    pin.start();
                }
            }
        });
        ping = MediaPlayer.create(getContext(), R.raw.ing); // Replace 'your_sound_file' with the actual file name
        ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ping != null) {
                    ping.start();
                }
            }
        });
        piong = MediaPlayer.create(getContext(), R.raw.iong); // Replace 'your_sound_file' with the actual file name
        iong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (piong != null) {
                    piong.start();
                }
            }
        });
        piong = MediaPlayer.create(getContext(), R.raw.iong); // Replace 'your_sound_file' with the actual file name
        iong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (piong != null) {
                    piong.start();
                }
            }
        });
        pu = MediaPlayer.create(getContext(), R.raw.wu); // Replace 'your_sound_file' with the actual file name
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pu != null) {
                    pu.start();
                }
            }
        });
        pua = MediaPlayer.create(getContext(), R.raw.ua); // Replace 'your_sound_file' with the actual file name
        ua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pua != null) {
                    pua.start();
                }
            }
        });
        puai = MediaPlayer.create(getContext(), R.raw.uai); // Replace 'your_sound_file' with the actual file name
        uai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puai != null) {
                    puai.start();
                }
            }
        });
        puan = MediaPlayer.create(getContext(), R.raw.uan); // Replace 'your_sound_file' with the actual file name
        uan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puan != null) {
                    puan.start();
                }
            }
        });
        puang = MediaPlayer.create(getContext(), R.raw.uang); // Replace 'your_sound_file' with the actual file name
        uang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puang != null) {
                    puang.start();
                }
            }
        });
        puo = MediaPlayer.create(getContext(), R.raw.uo); // Replace 'your_sound_file' with the actual file name
        uo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puo != null) {
                    puo.start();
                }
            }
        });
        pui = MediaPlayer.create(getContext(), R.raw.ui); // Replace 'your_sound_file' with the actual file name
        ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pui != null) {
                    pui.start();
                }
            }
        });
        pun = MediaPlayer.create(getContext(), R.raw.un); // Replace 'your_sound_file' with the actual file name
        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pun != null) {
                    pun.start();
                }
            }
        });
        puu = MediaPlayer.create(getContext(), R.raw.uu); // Replace 'your_sound_file' with the actual file name
        uu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puu != null) {
                    puu.start();
                }
            }
        });
        puue = MediaPlayer.create(getContext(), R.raw.uue); // Replace 'your_sound_file' with the actual file name
        uue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puue != null) {
                    puue.start();
                }
            }
        });
        puuan = MediaPlayer.create(getContext(), R.raw.uuan); // Replace 'your_sound_file' with the actual file name
        uuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puuan != null) {
                    puuan.start();
                }
            }
        });
        puun = MediaPlayer.create(getContext(), R.raw.uun); // Replace 'your_sound_file' with the actual file name
        uun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puun != null) {
                    puun.start();
                }
            }
        });

        return view;
    }}
