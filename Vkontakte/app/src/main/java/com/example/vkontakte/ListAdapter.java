package com.example.vkontakte;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public ListAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_items, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        ListItem listItem = listItems.get(position);
        holder.tvGroup.setText(listItem.getGroupName());
        holder.tvHeading.setText(listItem.getHeading());
        holder.tvLikes.setText(listItem.getLikes());
        holder.tvComments.setText(listItem.getComments());
        holder.tvViews.setText(listItem.getViews());
        holder.tvTime.setText(listItem.getPublishDate());
    }

    @Override
    public int getItemCount(){
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tvGroup;
        public TextView tvTime;
        public TextView tvHeading;
        public TextView tvLikes;
        public TextView tvComments;
        public TextView tvViews;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvGroup = (TextView) itemView.findViewById(R.id.tvGroup);
            tvTime = (TextView) itemView.findViewById(R.id.tvTime);
            tvHeading = (TextView) itemView.findViewById(R.id.tvHeading);
            tvLikes = (TextView) itemView.findViewById(R.id.tvLikes);
            tvComments = (TextView) itemView.findViewById(R.id.tvComment);
            tvViews = (TextView) itemView.findViewById(R.id.tvViews);
        }
    }
}