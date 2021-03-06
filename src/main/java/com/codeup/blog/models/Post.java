package com.codeup.blog.models;
public class Post {
    private Long id;
    private String title;
    private String body;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
    public Post(Long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Post(){
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
