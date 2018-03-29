package com.sunlayers.simpleweather.activity;

import android.app.Activity;
import android.os.Bundle;

import com.sunlayers.simpleweather.R;
import com.sunlayers.simpleweather.util.ActivityCollector;
import com.sunlayers.simpleweather.util.LogUtils;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        LogUtils.i("BaseActivity","---------->"+ getClass().getSimpleName() );
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeAllActivity();
    }
}
