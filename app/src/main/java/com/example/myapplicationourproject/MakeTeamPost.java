package com.example.myapplicationourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MakeTeamPost extends AppCompatActivity {

    EditText title, post, name;
    Button save;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_team_post);

        title = (EditText)findViewById(R.id.titletext);
        post = (EditText)findViewById(R.id.posttext);
        name = (EditText)findViewById(R.id.nametext);
        save = (Button)findViewById(R.id.save);
        firebaseAuth =  FirebaseAuth.getInstance();

        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference ref = db.getReference();
                String titles = title.getText().toString().trim();
                String posts = post.getText().toString().trim();
                String names = name.getText().toString().trim();

                Post post = new Post(titles, posts, names);

                ref.child("teampost").push().setValue(post);

                finish();
            }
        });
    }
}