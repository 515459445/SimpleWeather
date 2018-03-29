package com.sunlayers.simpleweather.model;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by chenyong on 2018/3/28.
 *
 * 省
 */

public class Province extends DataSupport {
    private int id;
    private String province_name;
    private String province_code;

    /**
     * 省包含的城市
     */
    private List<City> cities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getProvince_code() {
        return province_code;
    }

    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }


    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", province_name='" + province_name + '\'' +
                ", province_code='" + province_code + '\'' +
                ", cities=" + cities +
                '}';
    }
}
