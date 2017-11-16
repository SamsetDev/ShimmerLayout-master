package com.samset.androidshimmerlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.samset.samsetshimmerlayout.placeholder.ShimmerFrameLayoutFb;

public class SecondActivity extends AppCompatActivity {
    private ShimmerFrameLayoutFb layoutFb;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        layoutFb = findViewById(R.id.shimmer_view_container);
        linearLayout = findViewById(R.id.settings_container);
        layoutFb.startShimmerAnimation();

        linearLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                layoutFb.stopShimmerAnimation();
            }
        }, 10000);


    }


}
