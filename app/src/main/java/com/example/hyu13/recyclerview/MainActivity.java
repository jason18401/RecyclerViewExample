package com.example.hyu13.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames= new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getBitmaps();

    }

    private void getBitmaps(){
        mImageUrls.add("https://www.telegraph.co.uk/content/dam/Travel/Cruise/worlds-most-beautiful-ports/hongkong-harbour-xxlarge.jpg");
        mNames.add("Hong Kong");

        mImageUrls.add("https://japan-magazine.jnto.go.jp/jnto2wm/wp-content/uploads/1608_special_TOTO_main.jpg");
        mNames.add("Japan");

        mImageUrls.add("https://www.telegraph.co.uk/content/dam/Travel/2018/January/seoul-night-south-korea.jpg?imwidth=450");
        mNames.add("South Korea");

        mImageUrls.add("https://i.gocollette.com/img/destination-page/north-america/north-america-continent/north-america-continent-ms2.jpg?h=720&w=1280&la=en");
        mNames.add("America");

        mImageUrls.add("https://qph.fs.quoracdn.net/main-qimg-d18b00a0a4be832c51b7894d05aeb5d0-c");
        mNames.add("Canada");

        mImageUrls.add("https://www.telegraph.co.uk/content/dam/Travel/Cruise/worlds-most-beautiful-ports/hongkong-harbour-xxlarge.jpg");
        mNames.add("Hong Kong");

        mImageUrls.add("https://japan-magazine.jnto.go.jp/jnto2wm/wp-content/uploads/1608_special_TOTO_main.jpg");
        mNames.add("Japan");

        mImageUrls.add("https://www.telegraph.co.uk/content/dam/Travel/2018/January/seoul-night-south-korea.jpg?imwidth=450");
        mNames.add("South Korea");

        mImageUrls.add("https://i.gocollette.com/img/destination-page/north-america/north-america-continent/north-america-continent-ms2.jpg?h=720&w=1280&la=en");
        mNames.add("America");

        mImageUrls.add("https://qph.fs.quoracdn.net/main-qimg-d18b00a0a4be832c51b7894d05aeb5d0-c");
        mNames.add("Canada");

        getRecyclerView();
    }

    private void getRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerAdapter adapter = new RecyclerAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
