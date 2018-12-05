package com.samset.androidshimmerlayout;

import android.os.Bundle;

import com.samset.androidshimmerlayout.adapter.MyShimmerAdapter;
import com.samset.samsetshimmerlayout.views.ShimmerRecyclerView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private ShimmerRecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.showShimmerAdapter();

        recyclerView.postDelayed(new Runnable() {
            @Override
            public void run() {
                //recyclerView.hideShimmerAdapter();
                recyclerView.setAdapter(new MyShimmerAdapter(MainActivity.this));
            }
        }, 1000);
    }

}
