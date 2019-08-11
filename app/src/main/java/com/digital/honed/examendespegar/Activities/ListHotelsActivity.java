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


public class ListHotelsActivity extends BaseActivity implements HotelListContract.View {


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    private HotelListContract.Presenter mPresenter;
    private RecyclerView recyclerview;
    HotelsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new HotelListPresenter(this);
        mPresenter.start();
    }

    @Override
    public void init() {
        recyclerview = findViewById(R.id.recyclerview);
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
