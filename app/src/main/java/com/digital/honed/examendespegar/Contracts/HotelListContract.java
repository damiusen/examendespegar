package com.digital.honed.examendespegar.Contracts;

import com.digital.honed.examendespegar.Models.HotelList;

public interface HotelListContract {
    interface View {
        void init();
        
        void showError(String message);
        
        void loadDataInList(HotelList hotels);
    }
    
    interface Presenter {
    
        void start();
        
        void loadHotels();
    }
    
}