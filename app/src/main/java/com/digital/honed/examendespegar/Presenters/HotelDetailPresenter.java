package com.digital.honed.examendespegar.Presenters;

import com.digital.honed.examendespegar.Contracts.HotelDetailContract;
import com.digital.honed.examendespegar.Models.HotelDetails;
import com.digital.honed.examendespegar.Networking.Api.HotelTask;
import com.digital.honed.examendespegar.Networking.Callback;


public class HotelDetailPresenter implements HotelDetailContract.Presenter {
    HotelDetailContract.View mView;

    public HotelDetailPresenter(HotelDetailContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void loadHotelDetail(int hotelId) {
        HotelTask.getHotelDetail(hotelId, new Callback<HotelDetails>() {
            @Override
            public void returnResult(HotelDetails hotelDetails) {
                mView.loadData(hotelDetails);
            }

            @Override
            public void returnError(String message) {
                mView.showError(message);
            }
        });
    }

    @Override
    public void start() {
        mView.init();
    }
}
