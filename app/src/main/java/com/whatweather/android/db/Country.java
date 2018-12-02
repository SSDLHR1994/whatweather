package com.whatweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Administrator on 2018/12/2.
 */

public class Country extends LitePalSupport {
    private int id;
    private  String  countryName;
//    县的名字
    private  String weatherId;
//    县所对应的天气的ID
    private  int cityId;
//    当前县所属的市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
