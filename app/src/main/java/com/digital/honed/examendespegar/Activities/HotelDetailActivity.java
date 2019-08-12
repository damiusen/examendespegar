package com.digital.honed.examendespegar.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.digital.honed.examendespegar.Adapters.CommentsAdapter;
import com.digital.honed.examendespegar.Contracts.HotelDetailContract;
import com.digital.honed.examendespegar.Models.Amenities;
import com.digital.honed.examendespegar.Models.HotelDetails;
import com.digital.honed.examendespegar.Models.Price;
import com.digital.honed.examendespegar.Presenters.HotelDetailPresenter;
import com.digital.honed.examendespegar.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;

import static com.digital.honed.examendespegar.Helpers.StarRating.getStarImage;


public class HotelDetailActivity extends BaseActivity implements HotelDetailContract.View {

    @BindView(R.id.tv_name) TextView tvName;
    @BindView(R.id.tv_address) TextView tvAddress;
    @BindView(R.id.iv_stars) ImageView ivStars;
    @BindView(R.id.tv_description) TextView tvDescription;
    @BindView(R.id.tv_price) TextView tvPrice;
    @BindView(R.id.iv_main_picture) ImageView ivMainPicture;
    @BindView(R.id.ll_amenities) LinearLayout llAmenities;

    @BindView(R.id.recyclerview) RecyclerView recyclerview;

    private HotelDetailContract.Presenter mPresenter;
    private CommentsAdapter adapter;

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
        /*Price price = hotelDetails.getHotel().getPrice();
        double calculatedPrice = price.getBase() / price.getCurrency().getRatio();
        tvPrice.setText( "$" + calculatedPrice);
        List<Amenities> amenities = hotelDetails.getHotel().getAmenities();
        for (int i =0; i < amenities.size(); i++){
            TextView amenity = new TextView(this);
            amenity.setText("• "+amenities.get(i).getDescription());

            llAmenities.addView(amenity);
        }*/

        Picasso.get()
                .load(getStarImage(Integer.parseInt(hotelDetails.getHotel().getStars())))
                .into(ivStars);

        Picasso.get()
                .load(hotelDetails.getHotel().getMainPicture())
                .into(ivMainPicture);

        adapter = new CommentsAdapter(hotelDetails.getHotel().getReviews());
        recyclerview.setAdapter(adapter);
        
    }

}
