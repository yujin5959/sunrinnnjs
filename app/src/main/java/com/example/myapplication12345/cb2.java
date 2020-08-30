package com.example.myapplication12345;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class cb2 extends AppCompatActivity {
    RecyclerView.Adapter item;
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb2);

        TextView cb=findViewById(R.id.ptcstitle);
        final RecyclerView listview1=findViewById(R.id.recycler3);
        listview1.setHasFixedSize(true);
        listview1.setLayoutManager(new LinearLayoutManager(this)) ;

        data.add("자의누리 : 영상 제작 동아리, 3D와 영상을 배울수 있는 멀티과 동아리");
        data.add("MIR : 선린 인터넷 고등학교의 만화/일러스트레이션 동아리로 멀티미디어과의 전문동아리");
        data.add("TATE : adobe photoshop, adobe illustrator, adobe 3d max등을 주로 다루는 디자인 전문동아리");
        data.add("V.friends : 멀티미디어학과 디자인 교육 봉사 동아리");

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