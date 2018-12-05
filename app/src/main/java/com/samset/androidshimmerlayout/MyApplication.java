package com.samset.androidshimmerlayout;

import android.app.Application;
import android.content.Context;


/**
 * Copyright (C) ShimmerLayout-master - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Created by samset on 04/12/18 at 6:21 PM for ShimmerLayout-master .
 */


public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //MultiDex.install(this);
    }
}
