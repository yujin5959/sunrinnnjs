package com.example.myapplication12345;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class cb3 extends AppCompatActivity {
    RecyclerView.Adapter item;
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb3);

        TextView cb=findViewById(R.id.ptcstitle);
        final RecyclerView listview1=findViewById(R.id.recycler4);
        listview1.setHasFixedSize(true);
        listview1.setLayoutManager(new LinearLayoutManager(this)) ;

        data.add("ERP : 회계경제 동아리");
        data.add("BFD : 전문창업동아리");
        data.add("REVolution HMH : 전문창업동아리");
        data.add("FRS :펀드 연구동아리");
        data.add("TAXI : 2017년 만들어진 테크노경영과 세무회계 동아리");

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