package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

public class Review {

    @SerializedName("comments")
    private Comment comments;

    @SerializedName("user")
    private User user;

    public void setComments(Comment comments){
        this.comments = comments;
    }

    public Comment getComments(){
        return comments;
    }

    public void setUser(User user){
        this.user = user;
    }

    public User getUser(){
        return user;
    }

}
