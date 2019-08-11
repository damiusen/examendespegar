package com.digital.honed.examendespegar.Activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.digital.honed.examendespegar.Activities.Adapters.HotelsAdapter;
import com.digital.honed.examendespegar.Contracts.HotelListContract;
import com.digital.honed.examendespegar.Models.HotelList;
import com.digital.honed.examendespegar.Presenters.HotelListPresenter;
import com.digital.honed.examendespegar.R;

import butterknife.BindView;


public class ListHotelsActivity extends BaseActivity implements HotelListContract.View {

    @BindView(R.id.recyclerview) RecyclerView recyclerview;

    private HotelListContract.Presenter mPresenter;
    HotelsAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new HotelListPresenter(this);
        mPresenter.start();
    }

    @Override
    public void init() {
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(manager);
        mPresenter.loadHotels();
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void loadDataInList(HotelList hotels) {
        adapter = new HotelsAdapter(hotels.getHotels());
        recyclerview.setAdapter(adapter);
    }
}
