package com.example.myapplicationourproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ReviewActivity extends AppCompatActivity {

    FloatingActionButton floatingButton;
    ArrayList<Post> arrayList;
    ArrayList<String> key_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        floatingButton = (FloatingActionButton)findViewById(R.id.floatingActionButton);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        ListView list = (ListView)findViewById(R.id.list);
        arrayList = new ArrayList<>();
        key_list = new ArrayList<>();
        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        list.setAdapter(customAdapter);

        DatabaseReference myRef = db.getReference();
        myRef.child("reviewpost").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Post post = snapshot.getValue(Post.class);
                arrayList.add(post);
                key_list.add(snapshot.getKey());
                customAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ReviewActivity.this,DetailReviewPost.class);

                intent.putExtra("t", arrayList.get(position).getTitle());
                intent.putExtra("p", arrayList.get(position).getPost());
                intent.putExtra("key", key_list.get(position));
                startActivity(intent);
            }
        });

        floatingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ReviewActivity.this, MakeReviewPost.class);
                startActivity(intent);
            }
        });

    }
}