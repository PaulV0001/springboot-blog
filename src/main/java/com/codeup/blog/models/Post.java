package com.codeup.blog.models;

public class Post {

    private String title;
    private String body;
    private Long id;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post(long l, String first_title, String s) {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
