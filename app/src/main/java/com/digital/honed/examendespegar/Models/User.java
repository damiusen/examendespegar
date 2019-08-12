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

    public void setCurrency(String name){
        this.name = name;
    }

    public String getCurrency(){
        return name;
    }

    public void setFinalPrice(String first_name){
        this.first_name = first_name;
    }

    public String getFinalPrice(){
        return first_name;
    }

    public void setBase(String last_name){
        this.last_name = last_name;
    }

    public String getBase(){
        return last_name;
    }

    public void setBest(String country){
        this.country = country;
    }

    public String getBest(){
        return country;
    }
}
