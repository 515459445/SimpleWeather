package com.sunlayers.simpleweather.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyong on 2018/3/28.
 *
 * 活动管理器
 */

public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        if(!activities.contains(activity)){
            activities.add(activity);
        }
    }

    public static void removeActivity(Activity activity){
        if(activities.contains(activity)){
            activities.remove(activity);
        }
    }

    public static void removeAllActivity(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
