package com.example.vkontakte;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ClickActivity extends AppCompatActivity {

    TextView tvGroup, tvTime, tvTitle, tvLikes, tvComments, tvShares, tvViews;
    ImageView ivGroup, ivPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);


        tvGroup = findViewById(R.id.tvGroup);
        tvTime = findViewById(R.id.tvTime);
        tvTitle = findViewById(R.id.tvHeading);
        tvLikes = findViewById(R.id.tvLikes);
        tvComments = findViewById(R.id.tvComment);
        tvShares = findViewById(R.id.tvShare);
        tvViews = findViewById(R.id.tvViews);

        ivGroup = findViewById(R.id.ivGroupPhoto);
        ivPost = findViewById(R.id.ivPost);

        Intent intent = getIntent();

        String itvGroup = intent.getStringExtra("tvGroup");
        String itvTime = intent.getStringExtra("tvTime");
        String itvTitle = intent.getStringExtra("tvHeading");
        String itvLikes = intent.getStringExtra("tvLikes");
        String itvComments = intent.getStringExtra("tvComments");
        String itvShares = intent.getStringExtra("tvShares");
        String iImgURL = intent.getStringExtra("imgURL");
        String itvViews = intent.getStringExtra("tvViews");


        Picasso.with(this)
                .load(iImgURL)
                .into(ivPost);

        Picasso.with(this)
                .load(iImgURL)
                .into(ivGroup);


        tvGroup.setText(itvGroup);
        tvTime.setText(itvTime);
        tvTitle.setText(itvTitle);
        tvLikes.setText(itvLikes);
        tvComments.setText(itvComments);
        tvShares.setText(itvShares);
        tvViews.setText(itvViews);
    }

}
