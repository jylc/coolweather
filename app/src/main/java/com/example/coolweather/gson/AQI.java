package com.example.coolweather.gson;

/**
 * Created by wxb on 2018/3/17.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
