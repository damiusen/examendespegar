package com.digital.honed.examendespegar.Networking.Api;

import com.digital.honed.examendespegar.Models.HotelList;
import com.digital.honed.examendespegar.Networking.Callback;
import com.digital.honed.examendespegar.Networking.NetworkingUtils;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HotelTask {

    public static void getHotels(final Callback<HotelList> callback) {
        NetworkingUtils.getHotelApiInstance()
                .getHotels()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<HotelList>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    
                    }

                    @Override
                    public void onNext(HotelList hotels) {
                        callback.returnResult(hotels);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.returnError(e.getMessage());
                    }
                    
                    @Override
                    public void onComplete() {
                    
                    }
                });
    }
    
}