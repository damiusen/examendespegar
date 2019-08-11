package com.digital.honed.examendespegar.Presenters;

import com.digital.honed.examendespegar.Contracts.HotelContract;
import com.digital.honed.examendespegar.Models.HotelList;
import com.digital.honed.examendespegar.Networking.Api.HotelTask;
import com.digital.honed.examendespegar.Networking.Callback;


public class HotelPresenter implements HotelContract.Presenter {
    HotelContract.View mView;

    public HotelPresenter(HotelContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void loadHotels() {
        HotelTask.getHotels(new Callback<HotelList>() {
            @Override
            public void returnResult(HotelList hotels) {
                mView.loadDataInList(hotels);
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
