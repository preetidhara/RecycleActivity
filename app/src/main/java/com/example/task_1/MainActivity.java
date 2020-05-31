package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListData[] myListData = new MyListData[] {
                new MyListData("Sony","RS 15,000", R.drawable.phone),
                new MyListData("Iphone 11 pro max","RS 80,000", R.drawable.apple),
                new MyListData("OPPO","RS 25,000", R.drawable.oppo),
                new MyListData("RealMe","RS 15,000", R.drawable.realme),
                new MyListData("VIVO","RS 24,900", R.drawable.vivo),
                new MyListData("Model","RS 16,780", R.drawable.phone),
                new MyListData("RealMe","RS 10,220", R.drawable.realme),


        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData,getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);
    }
}
