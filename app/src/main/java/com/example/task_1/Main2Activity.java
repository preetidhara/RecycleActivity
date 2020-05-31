package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text1;
    ImageView imgView;
    TextView rs;
    int Image;
    String rupess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1=(TextView)findViewById(R.id.text1);
        imgView=(ImageView)findViewById(R.id.imgView);
        rs=(TextView)findViewById(R.id.rs);

        String intent =getIntent().getExtras().getString("key");
       Image=getIntent().getIntExtra("img",0);
        text1.setText(intent);
        imgView.setImageResource(Image);
        rupess =getIntent().getExtras().getString("price");
        rs.setText(rupess);


    }
}
