package com.example.hsk_application;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import android.media.MediaPlayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.speech.tts.TextToSpeech;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Basic_1Fragment extends Fragment {

    private TextToSpeech textToSpeech;

    private MediaPlayer mediaPlayer,pp,pb,pm,pf,pd,pt,pn,pl,pg,pk,ph,pj,pq,px,pz,pc,ps,pzh,pch,psh,pr,py,pw;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_basic_1, container, false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton b = view.findViewById(R.id.apb_b);
        b.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton p = view.findViewById(R.id.apb_p);
        p.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton m = view.findViewById(R.id.apb_m);
        m.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton f = view.findViewById(R.id.apb_f);
        f.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton d = view.findViewById(R.id.apb_d);
        d.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton t = view.findViewById(R.id.apb_t);
        t.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton n = view.findViewById(R.id.apb_n);
        n.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton l = view.findViewById(R.id.apb_l);
        l.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton g = view.findViewById(R.id.apb_g);
        g.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton k = view.findViewById(R.id.apb_k);
        k.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton h = view.findViewById(R.id.apb_h);
        h.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton j = view.findViewById(R.id.apb_j);
        j.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton q = view.findViewById(R.id.apb_q);
        q.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton x = view.findViewById(R.id.apb_x);
        x.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton z = view.findViewById(R.id.apb_z);
        z.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton c = view.findViewById(R.id.apb_c);
        c.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton s = view.findViewById(R.id.apb_s);
        s.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton zh = view.findViewById(R.id.apb_zh);
        zh.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton ch = view.findViewById(R.id.apb_ch);
        ch.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton sh = view.findViewById(R.id.apb_sh);
        sh.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton r = view.findViewById(R.id.apb_r);
        r.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton y = view.findViewById(R.id.apb_y);
        y.setAllCaps(false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AppCompatButton w = view.findViewById(R.id.apb_w);
        w.setAllCaps(false);

        pb = MediaPlayer.create(getContext(), R.raw.bb); // Replace 'your_sound_file' with the actual file name
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pb != null) {
                    pb.start();
                }
            }
        });

        pp = MediaPlayer.create(getContext(), R.raw.pp); // Replace 'your_sound_file' with the actual file name
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pp != null) {
                    pp.start();
                }
            }
        });

        pm = MediaPlayer.create(getContext(), R.raw.mm); // Replace 'your_sound_file' with the actual file name
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pm != null) {
                    pm.start();
                }
            }
        });
        pf = MediaPlayer.create(getContext(), R.raw.ff); // Replace 'your_sound_file' with the actual file name
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pf != null) {
                    pf.start();
                }
            }
        });
        pd = MediaPlayer.create(getContext(), R.raw.d); // Replace 'your_sound_file' with the actual file name
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pd != null) {
                    pd.start();
                }
            }
        });
        pt = MediaPlayer.create(getContext(), R.raw.t); // Replace 'your_sound_file' with the actual file name
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pt != null) {
                    pt.start();
                }
            }
        });
        pn = MediaPlayer.create(getContext(), R.raw.n); // Replace 'your_sound_file' with the actual file name
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pn != null) {
                    pn.start();
                }
            }
        });
        pl = MediaPlayer.create(getContext(), R.raw.l); // Replace 'your_sound_file' with the actual file name
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pl != null) {
                    pl.start();
                }
            }
        });
        pg = MediaPlayer.create(getContext(), R.raw.g); // Replace 'your_sound_file' with the actual file name
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pg != null) {
                    pg.start();
                }
            }
        });
        pk = MediaPlayer.create(getContext(), R.raw.k); // Replace 'your_sound_file' with the actual file name
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pk != null) {
                    pk.start();
                }
            }
        });
        ph = MediaPlayer.create(getContext(), R.raw.h); // Replace 'your_sound_file' with the actual file name
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ph != null) {
                    ph.start();
                }
            }
        });
        pj = MediaPlayer.create(getContext(), R.raw.j); // Replace 'your_sound_file' with the actual file name
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pj != null) {
                    pj.start();
                }
            }
        });
        pq = MediaPlayer.create(getContext(), R.raw.q); // Replace 'your_sound_file' with the actual file name
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pq != null) {
                    pq.start();
                }
            }
        });
        px = MediaPlayer.create(getContext(), R.raw.x); // Replace 'your_sound_file' with the actual file name
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (px != null) {
                    px.start();
                }
            }
        });
        pz = MediaPlayer.create(getContext(), R.raw.z); // Replace 'your_sound_file' with the actual file name
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pz != null) {
                    pz.start();
                }
            }
        });
        pc = MediaPlayer.create(getContext(), R.raw.c); // Replace 'your_sound_file' with the actual file name
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pc != null) {
                    pc.start();
                }
            }
        });
        ps = MediaPlayer.create(getContext(), R.raw.s); // Replace 'your_sound_file' with the actual file name
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ps != null) {
                    ps.start();
                }
            }
        });
        pzh = MediaPlayer.create(getContext(), R.raw.zh); // Replace 'your_sound_file' with the actual file name
        zh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pzh != null) {
                    pzh.start();
                }
            }
        });
        pch = MediaPlayer.create(getContext(), R.raw.ch); // Replace 'your_sound_file' with the actual file name
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pch != null) {
                    pch.start();
                }
            }
        });
        psh = MediaPlayer.create(getContext(), R.raw.sh); // Replace 'your_sound_file' with the actual file name
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (psh != null) {
                    psh.start();
                }
            }
        });
        pr = MediaPlayer.create(getContext(), R.raw.r); // Replace 'your_sound_file' with the actual file name
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pr != null) {
                    pr.start();
                }
            }
        });
        py = MediaPlayer.create(getContext(), R.raw.yi); // Replace 'your_sound_file' with the actual file name
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (py != null) {
                    py.start();
                }
            }
        });
        pw = MediaPlayer.create(getContext(), R.raw.wu); // Replace 'your_sound_file' with the actual file name
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pw != null) {
                    pw.start();
                }
            }
        });

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}