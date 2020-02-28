package com.example.vkontakte;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class ClickActivity extends AppCompatActivity {

    TextView tvGroup, tvTime, tvTitle, tvLikes, tvComments, tvShares, tvViews;
    ImageView ivGroup, ivPost;
    ImageButton ibLikes;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);

        context = this;

        tvGroup = findViewById(R.id.tvGroup);
        tvTime = findViewById(R.id.tvTime);
        tvTitle = findViewById(R.id.tvHeading);
        tvLikes = findViewById(R.id.tvLikes);
        tvComments = findViewById(R.id.tvComment);
        tvShares = findViewById(R.id.tvShare);
        tvViews = findViewById(R.id.tvViews);

        ibLikes = findViewById(R.id.iblike);

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

        ibLikes.setOnClickListener(new View.OnClickListener() {
            Intent intent = getIntent();
            String likes = intent.getStringExtra("tvLikes");
            @Override
            public void onClick(View view){
                Toast.makeText(context, "You liked this post ", Toast.LENGTH_LONG).show();
                int like=Integer.parseInt(likes)+1;
                tvLikes.setText(Integer.toString(like));
                tvLikes.setTextColor(Color.rgb(255,51,71));
            }
        });
    }
}
