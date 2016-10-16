package com.example.chua.memegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.chua.memegenerator.R.id.mbtnCreate;
import static com.example.chua.memegenerator.R.id.mtxtTop;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Create;
    private EditText top, bot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Create = (Button) findViewById(R.id.mbtnCreate);
        top = (EditText) findViewById(R.id.mtxtTop);
        bot = (EditText) findViewById(R.id.mtxtBot);
        Create.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.mbtnCreate:
                intent = new Intent(this, Main2Activity.class);
                if (TextUtils.isEmpty(top.getText().toString()) && TextUtils.isEmpty(bot.getText().toString()))
                    Toast.makeText(MainActivity.this, "at least fill up one field!", Toast.LENGTH_SHORT).show();
                else {
                    intent.putExtra("top", top.getText().toString());
                    intent.putExtra("bot", bot.getText().toString());
                    startActivity(intent);}
        }
    }
}
