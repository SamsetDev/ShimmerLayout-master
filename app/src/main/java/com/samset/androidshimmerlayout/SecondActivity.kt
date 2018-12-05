package com.samset.androidshimmerlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        shimmer_view_container?.startShimmerAnimation()
        settings_container?.postDelayed({ shimmer_view_container?.stopShimmerAnimation() }, 1500)


    }


}
