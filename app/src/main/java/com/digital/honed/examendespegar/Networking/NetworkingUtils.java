package com.digital.honed.examendespegar.Networking;

public class NetworkingUtils {

    private static HotelListService hotelService;

    public static HotelListService getHotelApiInstance() {
        if (hotelService == null)
            hotelService = RetrofitAdapter.getInstance().create(HotelListService.class);

        return hotelService;
    }
    
}