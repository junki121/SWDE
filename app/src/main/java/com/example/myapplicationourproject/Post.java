package com.example.myapplicationourproject;

public class Post {
    String title;
    String post;
    String name;
    
    Post(){}
    
    Post(String title, String post, String name){
        this.title = title;
        this.post = post;
        this.name = name;
    }
    public String getTitle() {return title;}
    public String getPost() {return post;}
    public String getName() {return name;}

}
