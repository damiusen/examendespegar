package com.digital.honed.examendespegar.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.digital.honed.examendespegar.Contracts.HotelDetailContract;
import com.digital.honed.examendespegar.Models.HotelDetails;
import com.digital.honed.examendespegar.Presenters.HotelDetailPresenter;
import com.digital.honed.examendespegar.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;


public class HotelDetailActivity extends BaseActivity implements HotelDetailContract.View {

    @BindView(R.id.tv_name) TextView tvName;
    @BindView(R.id.tv_address) TextView tvAddress;
    @BindView(R.id.iv_stars) ImageView ivStars;
    @BindView(R.id.tv_description) TextView tvDescription;
    @BindView(R.id.iv_main_picture) ImageView ivMainPicture;
    
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
        tvName.setText(hotelDetails.getHotel().getName());
        tvDescription.setText(hotelDetails.getHotel().getDescription());
        tvAddress.setText(hotelDetails.getHotel().getAddress());

        Picasso.get()
                .load(getStarImage(Integer.parseInt(hotelDetails.getHotel().getStars())))
                .into(ivStars);

        Picasso.get()
                .load(hotelDetails.getHotel().getMainPicture())
                .into(ivMainPicture);
        
    }

    private int getStarImage(int starId){
        switch (starId){
            case 1:
                return R.drawable.onestars;
            case 2:
                return R.drawable.twostars;
            case 3:
                return R.drawable.threestars;
            case 4:
                return R.drawable.fourstars;
            case 5:
                return R.drawable.fivestars;
        }
        return 1;
    }
}
