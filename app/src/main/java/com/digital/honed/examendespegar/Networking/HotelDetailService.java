package com.digital.honed.examendespegar.Networking;

import com.digital.honed.examendespegar.Models.HotelDetails;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface HotelDetailService {

    @GET("/hotels/{hotel_id}")
    Observable<HotelDetails> getHotelDetail(@Path("hotel_id") int hotelId);
    //Completable getHotelDetail(@Path("hotel_id") int hotelId);
}