package com.digital.honed.examendespegar.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.digital.honed.examendespegar.Contracts.HotelDetailContract;
import com.digital.honed.examendespegar.Models.HotelDetails;
import com.digital.honed.examendespegar.Presenters.HotelDetailPresenter;
import com.digital.honed.examendespegar.R;


public class HotelDetailActivity extends BaseActivity implements HotelDetailContract.View {

    private HotelDetailContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new HotelDetailPresenter(this);
        mPresenter.start();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_hotel_detail;
    }

    @Override
    public void init() {
        Intent intent  = getIntent();
        int    hotelId = intent.getIntExtra("hotel_id", 0);
        mPresenter.loadHotelDetail(hotelId);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void loadData(HotelDetails hotelDetails) {
        Toast.makeText(this, hotelDetails.getHotel().getName(), Toast.LENGTH_LONG).show();
    }
}
