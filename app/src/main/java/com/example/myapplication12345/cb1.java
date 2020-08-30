package com.example.myapplication12345;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class cb1 extends AppCompatActivity {

    RecyclerView.Adapter item;
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb1);

        TextView cb=findViewById(R.id.ptcstitle);
        final RecyclerView listview1=findViewById(R.id.recycler2);
        listview1.setHasFixedSize(true);
        listview1.setLayoutManager(new LinearLayoutManager(this)) ;

        data.add("Zer0pen : 제로픈의 본명은 원래 0pen으로써 원래 오픈소스 관련 동아리였지만 후에 게임개발동아리로 전향한 동아리");
        data.add("RG : Republic of Game의 약자로 게임 개발 전문 동아리");
        data.add("IWOP : Internet World Operation People 의 약자이다. IWOP은 2001년에 개설된 선린인터넷고등학교의 웹개발 동아리");
        data.add("App:ple Pi : Android의 첫 번째 버전의 이름 Apple pie와 모바일 앱 개발 동아리의 App을 합쳐서 App:ple Pi라는 이름이 탄생한 킹갓 동아리");
        data.add("AnA : Application and Architecture의 약자로 소프트웨어과 서버 전문동아리");
        data.add("EDCAN : 015년 신설된 소프트웨어과 전문 동아리로, 안드로이드 어플리케이션 / 웹 / IoT을 중심으로 다루는 동아리");


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