package com.digital.honed.examendespegar.Activities.Adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.digital.honed.examendespegar.Activities.HotelDetailActivity;
import com.digital.honed.examendespegar.Models.Hotel;
import com.digital.honed.examendespegar.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.MyViewHolder> {

    List<Hotel> hotelList = new ArrayList<>();

    public HotelsAdapter(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        ButterKnife.bind(this, view);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvTitle.setText(hotelList.get(position).getName());
        holder.tvId.setText(hotelList.get(position).getId()+"");
        holder.tvBody.setText(hotelList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.user_id) TextView tvId;
        @BindView(R.id.user_title) TextView tvTitle;
        @BindView(R.id.user_body) TextView tvBody;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick
        void onClick(View view) {
            Intent myIntent = new Intent(view.getContext(), HotelDetailActivity.class);
            myIntent.putExtra("hotel_id", hotelList.get(getAdapterPosition()).getId());
            view.getContext().startActivity(myIntent);
        }


    }

}