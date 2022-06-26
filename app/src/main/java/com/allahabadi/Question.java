package com.allahabadi;

public class Question {
    String uid, post,imageuri;Long time;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getImageuri() {
        return imageuri;
    }

    public void setImageuri(String imageuri) {
        this.imageuri = imageuri;
    }

    public Question(String uid, String post, Long time) {
        this.uid = uid;
        this.post = post;
        this.time = time;
    }

    public Question(String uid, String post, Long time,String imageuri) {
        this.uid = uid;
        this.post = post;
        this.time = time;
        this.imageuri= imageuri;
    }
}
