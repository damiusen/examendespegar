package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("name")
    private String name;

    @SerializedName("first_name")
    private String first_name;

    @SerializedName("last_name")
    private String last_name;

    @SerializedName("country")
    private String country;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFirstName(String first_name){
        this.first_name = first_name;
    }

    public String getFirstName(){
        return first_name;
    }

    public void setLastName(String last_name){
        this.last_name = last_name;
    }

    public String getLastName(){
        return last_name;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return country;
    }
}
