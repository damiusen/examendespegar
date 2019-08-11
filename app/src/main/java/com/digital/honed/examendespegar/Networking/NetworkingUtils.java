package com.digital.honed.examendespegar.Networking;

public class NetworkingUtils {

    private static HotelListService hotelService;
    private static HotelDetailService hotelDetailService;

    public static HotelListService getHotelApiInstance() {
        if (hotelService == null)
            hotelService = RetrofitAdapter.getInstance().create(HotelListService.class);

        return hotelService;
    }
    public static HotelDetailService getHotelDetailApiInstance() {
        if (hotelDetailService == null)
            hotelDetailService = RetrofitAdapter.getInstance().create(HotelDetailService.class);

        return hotelDetailService;
    }
    
}