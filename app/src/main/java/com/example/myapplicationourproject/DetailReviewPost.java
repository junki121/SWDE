package com.example.myapplicationourproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;

public class DetailReviewPost extends AppCompatActivity {

    Button btn;
    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_review_post);

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

                Intent intent = new Intent(DetailReviewPost.this,Commentpost.class);

                intent.putExtra("key", key);
                intent.putExtra("RT",0);
                startActivity(intent);
            }
        });


    }
}
