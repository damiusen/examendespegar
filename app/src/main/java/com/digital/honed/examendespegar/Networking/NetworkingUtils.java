package com.digital.honed.examendespegar.Networking;

public class NetworkingUtils {

    private static HotelService hotelService;

    public static HotelService getHotelApiInstance() {
        if (hotelService == null)
            hotelService = RetrofitAdapter.getInstance().create(HotelService.class);

        return hotelService;
    }
    
}