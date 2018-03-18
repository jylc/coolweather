package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wxb on 2018/3/17.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Updata update;

    public class Updata{
        @SerializedName("loc")
        public String upadtaTime;
    }
}
