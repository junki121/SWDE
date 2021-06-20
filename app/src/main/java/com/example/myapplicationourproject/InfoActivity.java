package com.example.myapplicationourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        final Button quit_btn1 = (Button)findViewById(R.id.quit_btn1);

        final Button info_btn1 = (Button)findViewById(R.id.info1);
        final Button info_btn2 = (Button)findViewById(R.id.info2);
        final Button info_btn3 = (Button)findViewById(R.id.info3);
        final Button info_btn4 = (Button)findViewById(R.id.info4);
        final Button info_btn5 = (Button)findViewById(R.id.info5);
        final Button info_btn6 = (Button)findViewById(R.id.info6);
        final Button info_btn7 = (Button)findViewById(R.id.info7);
        final Button info_btn8 = (Button)findViewById(R.id.info8);
        final Button info_btn9 = (Button)findViewById(R.id.info9);
        final Button info_btn10 = (Button)findViewById(R.id.info10);
        final Button info_btn11 = (Button)findViewById(R.id.info11);
        final Button info_btn12 = (Button)findViewById(R.id.info12);
        final Button info_btn13 = (Button)findViewById(R.id.info13);
        final Button info_btn14 = (Button)findViewById(R.id.info14);
        final Button info_btn15 = (Button)findViewById(R.id.info15);


        quit_btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent registerIntent = new Intent(InfoActivity.this, MainActivity.class);
                InfoActivity.this.startActivityForResult(registerIntent,0);
            }
        });


        info_btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4Njk4NzQlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NjkwOTElMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NjkwNjklMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4Njg5NjklMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NjczMjglMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NjczMjMlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NjU2NTklMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NjU2NTclMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NjM3MTAlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NTk0ODAlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QxJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NTU0NTMlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QyJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NTI4MzUlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QyJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NTI2NTAlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QyJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NDg1NzQlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QyJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        info_btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cse.pusan.ac.kr/cse/50876/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGY3NlJTJGMTIyNzglMkY4NDcxNDAlMkZhcnRjbFZpZXcuZG8lM0ZiYnNPcGVuV3JkU2VxJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2c3JjaENvbHVtbiUzRCUyNnBhZ2UlM0QyJTI2c3JjaFdyZCUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2YmJzQ2xTZXElM0QlMjZwYXNzd29yZCUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2"));
                startActivity(intent);
            }
        });

        Intent intent = new Intent(this.getIntent());
    }
}