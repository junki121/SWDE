package com.example.myapplicationourproject;

public class Comment {
    String comment;
    String name;

    Comment(){}

    Comment(String comment, String name){
        this.comment = comment;
        this.name = name;

    }

    public String getComment() {return comment;}
    public String getName() {return name;}
}
