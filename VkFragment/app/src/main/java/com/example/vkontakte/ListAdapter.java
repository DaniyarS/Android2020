package com.example.vkontakte;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;


import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    public List<ListItem> listItems;
    public Context context;

    public ListAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_items, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position){
        final ListItem listItem = listItems.get(position);
        holder.tvGroup.setText(listItem.getGroupName());
        holder.tvHeading.setText(listItem.getHeading());
        holder.tvLikes.setText(listItem.getLikes());
        holder.tvComments.setText(listItem.getComments());
        holder.tvViews.setText(listItem.getViews());
        holder.tvTime.setText(listItem.getPublishDate());
        holder.tvShares.setText(listItem.getShares());

        Picasso.with(context)
        .load(listItem.getImgURL())
        .into(holder.ivPost);

        Picasso.with(context)
                .load(listItem.getImgURL())
                .into(holder.ivGroupPhoto);


        holder.ibLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(context, "You liked this post ", Toast.LENGTH_LONG).show();
                holder.tvLikes.setText(Integer.toString(Integer.parseInt(listItem.getLikes()) + 1));
            }
        });

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String tvGroup = listItems.get(position).getGroupName();
                String tvHeading = listItems.get(position).getHeading();
                String tvLikes = listItems.get(position).getLikes();
                String tvComments = listItems.get(position).getComments();
                String tvShares = listItems.get(position).getShares();
                String tvTime = listItems.get(position).getPublishDate();
                String tvViews = listItems.get(position).getViews();
                String imgURL = listItems.get(position).getImgURL();

                Picasso.with(context)
                        .load(imgURL)
                        .into(holder.ivPost);

                Picasso.with(context)
                        .load(imgURL)
                        .into(holder.ivGroupPhoto);


                Intent intent = new Intent(context, ClickActivity.class);
                intent.putExtra("tvGroup", tvGroup);
                intent.putExtra("tvHeading", tvHeading);
                intent.putExtra("tvLikes", tvLikes);
                intent.putExtra("tvComments", tvComments);
                intent.putExtra("tvShares", tvShares);
                intent.putExtra("tvTime", tvTime);
                intent.putExtra("tvViews", tvViews);
                intent.putExtra("imgURL", imgURL);

                context.startActivity(intent);
            }

        });


    }

    @Override
    public int getItemCount(){
        return listItems.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvGroup, tvTime, tvHeading, tvLikes, tvComments, tvShares, tvViews;
        ImageView ivPost, ivGroupPhoto;
        CardView cardView;
        ImageButton ibLikes;
        ItemClickListener itemClickListener;


        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvGroup = itemView.findViewById(R.id.tvGroup);
            tvTime =  itemView.findViewById(R.id.tvTime);
            tvHeading =  itemView.findViewById(R.id.tvHeading);
            tvLikes = itemView.findViewById(R.id.tvLikes);
            tvComments =itemView.findViewById(R.id.tvComment);
            tvViews = itemView.findViewById(R.id.tvViews);
            ivPost = itemView.findViewById(R.id.ivPost);
            ivGroupPhoto = itemView.findViewById(R.id.ivGroupPhoto);
            cardView = itemView.findViewById(R.id.cardView);
            ibLikes = itemView.findViewById(R.id.iblike);
            tvShares = itemView.findViewById(R.id.tvShare);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.onItemClickListener(v, getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener ic){
            this.itemClickListener = ic;
        }
    }
}