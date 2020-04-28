package com.example.vkontakte;

import android.content.Context;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerView;


    private List<ListItem> listItems;

    static Context myContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myContext = this;

        RecyclerView.Adapter adapter;


        recyclerViewStart();
        loadJSONFromAsset();

        try {
            listItems = new ArrayList<>();
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray array_post = obj.getJSONArray("posts");

            for (int i = 0; i < array_post.length(); i++) {
                ListItem ls = new ListItem();

                JSONObject jo_inside = array_post.getJSONObject(i);

                String heading = jo_inside.getString("heading");
                String time = jo_inside.getString("time");
                String title = jo_inside.getString("title");
                String likes = jo_inside.getString("likes");
                String comments = jo_inside.getString("comments");
                String shares = jo_inside.getString("shares");
                String views = jo_inside.getString("views");
                String imgURL = jo_inside.getString("gImage");


                ls.setGroupName(heading);
                ls.setPublishDate(time);
                ls.setHeading(title);
                ls.setLikes(likes);
                ls.setComments(comments);
                ls.setShares(shares);
                ls.setViews(views);
                ls.setImgURL(imgURL);


                listItems.add(ls);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        adapter = new ListAdapter(listItems, this);
        recyclerView.setAdapter(adapter);


    }

    public String loadJSONFromAsset() {
        String json;
        try {

            InputStream is = MainActivity.myContext.getAssets().open("a.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }

    public void recyclerViewStart() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}

