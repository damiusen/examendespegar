package com.digital.honed.examendespegar.Contracts;

import com.digital.honed.examendespegar.Models.HotelDetails;

public interface HotelDetailContract {
    interface View {
        void init();
        
        void showError(String message);
        
        void loadData(HotelDetails hotelDetails);
    }
    
    interface Presenter {
    
        void start();
        
        void loadHotelDetail(int HotelId);
    }
    
}