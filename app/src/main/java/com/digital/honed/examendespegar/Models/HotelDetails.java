package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HotelDetails {

    @SerializedName("id")
    private int id;

    @SerializedName("hotel")
    private Hotel hotel;

    @SerializedName("price")
    private Price price;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }

    public Hotel getHotel(){
        return hotel;
    }

    public void setPrice(Price price){
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}