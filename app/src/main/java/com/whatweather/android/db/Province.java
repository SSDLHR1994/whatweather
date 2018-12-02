package com.whatweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Administrator on 2018/12/2.
 */

public class Province extends LitePalSupport {
    private  int id ;


    private String provinceName;
    private  int provinceCode;

//    省的名称
//省的代号
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
