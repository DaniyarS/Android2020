package com.example.vkontakte;

import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import com.android.volley.toolbox.JsonArrayRequest;
import com.google.android.material.bottomnavigation.BottomNavigationView;

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

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItems;

    static Context myContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager( new LinearLayoutManager(this));
//
//        listItems = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++){
//
//            ListItem listItem = new ListItem(
//                    "heading " + i+1,
//                    i+5 + " минут назад",
//                    "heading ",
//                    "122 ",
//                    "22 ",
//                    "1000 ",
//                    "c"
//            );
//
//            listItems.add(listItem);
//        }
//
//        adapter = new ListAdapter(listItems, this);
//
//        recyclerView.setAdapter(adapter);

        //NEW CODE


        myContext = this;

        recyclerViewStart();
        loadJSONFromAsset();

        try {
            listItems = new ArrayList<>();
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray array_post = obj.getJSONArray("posts");

            for (int i = 0; i < array_post.length(); i++){
                ListItem ls = new ListItem();

                JSONObject jo_inside = array_post.getJSONObject(i);

                String heading = jo_inside.getString("heading");
                String time = jo_inside.getString("time");
                String title = jo_inside.getString("title");
                String likes = jo_inside.getString("likes");
                String comments = jo_inside.getString("comments");
                String views = jo_inside.getString("views");
                String imgURL = jo_inside.getString("gImage");



                ls.setGroupName(heading);
                ls.setPublishDate(time);
                ls.setHeading(title);
                ls.setLikes(likes);
                ls.setComments(comments);
                ls.setViews(views);
                ls.setImgURL(imgURL);


                listItems.add(ls);
            }
        }
        catch (JSONException e){
            e.printStackTrace();
        }
        adapter = new ListAdapter(listItems, this);
        recyclerView.setAdapter(adapter);


    }

    public  String loadJSONFromAsset()  {
        String json = null;
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

    public void recyclerViewStart(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}

