package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

public class Comment {

    @SerializedName("title")
    private String title;

    @SerializedName("good")
    private String good;

    @SerializedName("bad")
    private String bad;

    @SerializedName("type")
    private String type;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setGood(String good){
        this.good = good;
    }

    public String getGood(){
        return good;
    }

    public void setBad(String bad){
        this.bad = bad;
    }

    public String getBad(){
        return bad;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
