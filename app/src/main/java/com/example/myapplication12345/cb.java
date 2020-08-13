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

        data.add("Layer 7 : 해킹동아리이고 OSI 7계층을 모델로 따서 각 계층별로 목표설정, 마지막 최상위층에는 창업이 목표였다.");
        data.add("Layer 22 : 해킹동아리이고 OSI 7계층을 모델로 따서 각 계층별로 목표설정, 마지막 최상위층에는 창업이 목표였다.");

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