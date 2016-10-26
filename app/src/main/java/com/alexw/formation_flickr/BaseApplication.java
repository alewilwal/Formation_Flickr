package com.alexw.formation_flickr;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Human Booster on 24/10/2016.
 */

public class BaseApplication extends Application{

    @Override public void onCreate(){
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this).build());



    }
}
