package com.example.myapplication12345;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class cb extends AppCompatActivity {

    RecyclerView.Adapter item;
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb);

        TextView cb=findViewById(R.id.ptcstitle);
        final RecyclerView listview1=findViewById(R.id.recycler1);
        listview1.setHasFixedSize(true);
        listview1.setLayoutManager(new LinearLayoutManager(this)) ;

        data.add("Layer 7 : 해킹동아리이고 OSI 7계층을 모델로 따서 각 계층별로 목표설정, 마지막 최상위층에는 창업을 목표로 삼은 동아리");
        data.add("Nefus : 네트워크 동아리, 유학반 동아리이며 2016년 IoT 동아리로 변경된 동아리");
        data.add("Unifox : 게임(PC), 웹, 앱(스마트폰/웨어러블), 임베디드, 리버싱, 시스템해킹, 서버/네트워크 구축 등 넓은 프로그래밍 분야를 다루는 동아리");
        data.add("TeamLog : 2013년 4월에 창설된 서버 구축 동아리");
        data.add("Emotion : 인공지능 동아리이며 그 특징을 살려 인공지능을 연구하고 개발하는 동아리");

        item = new itemadapter(data);
        listview1.setAdapter(item);

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listview1.getVisibility() != View.GONE) {
                    listview1.setVisibility(View.GONE);
                } else {
                    listview1.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}