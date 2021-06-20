package com.example.myapplicationourproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final ImageButton oshBtn = (ImageButton)findViewById(R.id.osh_btn);

        final Button infoButton = (Button)findViewById(R.id.infoButton);
        final Button reviewButton = (Button)findViewById(R.id.reviewButton);
        final Button teamButton = (Button)findViewById(R.id.teamButton);

        infoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                infoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                reviewButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);


            }
        });

        reviewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                infoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                reviewButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                teamButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                Intent intent = new Intent(MainActivity.this, ReviewActivity.class);
                startActivity(intent);

            }
        });

        teamButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                infoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                reviewButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                teamButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

                Intent intent = new Intent(MainActivity.this, TeamActivity.class);
                startActivity(intent);

            }
        });
    }
}