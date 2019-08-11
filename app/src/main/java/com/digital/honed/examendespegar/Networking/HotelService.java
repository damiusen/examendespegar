package com.digital.honed.examendespegar.Networking;


import com.digital.honed.examendespegar.Models.HotelList;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface HotelService {

    @GET("/hotels")
    Observable<HotelList> getHotels();
}