package com.example.chua.memegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Chua on 10/16/2016.
 */
public class Main2Activity extends AppCompatActivity {
    private TextView top, bot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        top = (TextView)findViewById(R.id.mtxtTop);
        bot = (TextView)findViewById(R.id.mtxtBot);
        top.setText(intent.getStringExtra("top"));
        bot.setText(intent.getStringExtra("bot"));
        }
}
