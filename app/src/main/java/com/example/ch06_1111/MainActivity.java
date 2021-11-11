package com.example.ch06_1111;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TableRow;
import android.widget.ViewFlipper;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.ch06_10);

//        String[] items = {"CSI-뉴욕", "CSI-라스베가스", "CSI-마이애미미", "Friends", "Fringe", "Lost"};
//
//        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items);
//        auto.setAdapter(adapter);
//
//        MultiAutoCompleteTextView multi = (MultiAutoCompleteTextView) findViewById(R.id.MultiAutoCompleteTextView1);
//        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
//
//        multi.setTokenizer(token);
//        multi.setAdapter(adapter);
//        setContentView(R.layout.ch06_12);
//        setContentView(R.layout.ch06_13);
//        setContentView(R.layout.ch06_14);



//        setContentView(R.layout.ch06_15);
//
//        Button btnPrev, btnNext;
//        final ViewFlipper vFlipper;
//
//        btnPrev = findViewById(R.id.btnPrev);
//        btnNext = findViewById(R.id.btnNext);
//        vFlipper = findViewById(R.id.viewFlipper1);
//
//        btnPrev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                vFlipper.showPrevious();
//            }
//        });
//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                vFlipper.showNext();
//            }
//        });


        //test01
//        setContentView(R.layout.ch06_test_01);
//
//        Button btnPrev, btnNext;
//        final ViewFlipper vFlipper;
//
//        btnPrev = findViewById(R.id.btnPrev);
//        btnNext = findViewById(R.id.btnNext);
//        vFlipper = findViewById(R.id.viewFlipper1);
//
//        btnPrev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                vFlipper.startFlipping();
//                vFlipper.setFlipInterval(1000);
//            }
//        });
//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                vFlipper.stopFlipping();
//            }
//        });

//        setContentView(R.layout.ch06_17);
//
//        TabHost tabHost = getTabHost();
//
//        TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
//        tabSpecSong.setContent(R.id.tabSong);
//        tabHost.addTab(tabSpecSong);
//
//        TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
//        tabSpecArtist.setContent(R.id.tabArtist);
//        tabHost.addTab(tabSpecArtist);
//
//        TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
//        tabSpecAlbum.setContent(R.id.tabAlbum);
//        tabHost.addTab(tabSpecAlbum);
//
//        tabHost.setCurrentTab(0);

        //예제 2
        setContentView(R.layout.ch06_test_02);

        TabHost tabHost = getTabHost();

        TabSpec tab1 = tabHost.newTabSpec("TAB1").setIndicator("강아지");
        tab1.setContent(R.id.iv1);
        tabHost.addTab(tab1);

        TabSpec tab2 = tabHost.newTabSpec("TAB2").setIndicator("고양이");
        tab2.setContent(R.id.iv2);
        tabHost.addTab(tab2);

        TabSpec tab3 = tabHost.newTabSpec("TAB3").setIndicator("토끼");
        tab3.setContent(R.id.iv3);
        tabHost.addTab(tab3);

        TabSpec tab4 = tabHost.newTabSpec("TAB4").setIndicator("말");
        tab4.setContent(R.id.iv4);
        tabHost.addTab(tab4);

        tabHost.setCurrentTab(1);




    }
}