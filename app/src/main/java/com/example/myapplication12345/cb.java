package com.example.myapplication12345;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class cb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb);

        TextView cb=findViewById(R.id.ptcstitle);
        final ListView listview1=findViewById(R.id.recycler1);

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