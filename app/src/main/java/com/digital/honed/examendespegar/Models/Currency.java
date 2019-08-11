package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("code")
    private String code;

    @SerializedName("mask")
    private String mask;

    @SerializedName("ratio")
    private double ratio;

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setMask(String mask){
        this.mask = mask;
    }

    public String getMask(){
        return mask;
    }

    public void setRatio(double ratio){
        this.ratio = ratio;
    }

    public double getRatio(){
        return ratio;
    }

}
