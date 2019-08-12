package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hotel{

    @SerializedName("id")
    private int id;

    @SerializedName("stars")
    private String stars;

    @SerializedName("name")
    private String name;

    @SerializedName("address")
    private String address;

    @SerializedName("description")
    private String description;

    @SerializedName("main_picture")
    private String main_picture;

    @SerializedName("amenities")
    private List<Amenities> amenities;

    @SerializedName("price")
    private Price price;

    @SerializedName("reviews")
    private List<Review> reviews;

    @SerializedName("userId")
    private int userId;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setStars(String stars){
        this.stars = stars;
    }

    public String getStars(){
        return stars;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setMainPicture(String main_picture){
        this.main_picture = main_picture;
    }

    public String getMainPicture(){
        return main_picture;
    }

    public void setAmenities(List<Amenities> amenities){
        this.amenities = amenities;
    }

    public List<Amenities> getAmenities(){
        return amenities;
    }

    public void setPrice(Price price){
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public void setReviews(List<Review> reviews){
        this.reviews = reviews;
    }

    public List<Review> getReviews(){
        return reviews;
    }
}