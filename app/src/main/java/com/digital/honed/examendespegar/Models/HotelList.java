package com.digital.honed.examendespegar.Models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HotelList{

    @SerializedName("items")
    private List<Hotel> hotels;

    public void setHotels(List<Hotel> hotels){
        this.hotels = hotels;
    }

    public List<Hotel> getHotels(){
        return this.hotels;
    }
}