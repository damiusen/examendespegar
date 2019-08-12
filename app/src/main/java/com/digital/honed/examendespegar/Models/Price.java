package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("currency")
    private Currency currency;

    @SerializedName("final_price")
    private boolean final_price;

    @SerializedName("base")
    private int base;

    @SerializedName("best")
    private int best;

    public void setCurrency(Currency currency){
        this.currency = currency;
    }

    public Currency getCurrency(){
        return currency;
    }

    public void setFinalPrice(boolean final_price){
        this.final_price = final_price;
    }

    public Boolean getFinalPrice(){
        return final_price;
    }

    public void setBase(int base){
        this.base = base;
    }

    public int getBase(){
        return base;
    }

    public void setBest(int best){
        this.best = best;
    }

    public int getBest(){
        return best;
    }
}
