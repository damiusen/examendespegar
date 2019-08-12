package com.digital.honed.examendespegar.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.digital.honed.examendespegar.Models.Review;
import com.digital.honed.examendespegar.R;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.MyViewHolder> {

    List<Review> reviews;

    public CommentsAdapter(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_comments, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.userName.setText(reviews.get(position).getUser().getName());
        holder.title.setText(reviews.get(position).getComments().getTitle());
        holder.goodComment.setText(reviews.get(position).getComments().getGood());
        holder.badComment.setText(reviews.get(position).getComments().getBad());
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_comment_user_name) TextView userName;
        @BindView(R.id.tv_comment_title) TextView title;
        @BindView(R.id.tv_comment_good) TextView goodComment;
        @BindView(R.id.tv_comment_bad) TextView badComment;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}