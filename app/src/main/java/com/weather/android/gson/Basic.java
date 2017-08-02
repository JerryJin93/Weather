package com.weather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jerry on 2017/8/2.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
