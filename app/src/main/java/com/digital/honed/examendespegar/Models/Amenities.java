package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

public class Amenities {

    @SerializedName("id")
    private String id;

    @SerializedName("description")
    private String description;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
