package com.example.myapplicationourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailTeamPost extends AppCompatActivity {

    Button btn;
    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_team_post);

        TextView text1 = (TextView)findViewById(R.id.postname);
        TextView text2 = (TextView)findViewById(R.id.postdetail);
        btn = (Button)findViewById(R.id.plussave);

        Intent intent = getIntent();

        text1.setText(intent.getStringExtra("t"));
        text2.setText(intent.getStringExtra("p"));
        key = intent.getStringExtra("key");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DetailTeamPost.this,Commentpost.class);

                intent.putExtra("key", key);
                intent.putExtra("RT",1);
                startActivity(intent);
            }
        });


    }
}