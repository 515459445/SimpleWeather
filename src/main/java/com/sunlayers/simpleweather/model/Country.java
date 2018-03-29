package com.sunlayers.simpleweather.model;

import org.litepal.crud.DataSupport;

/**
 * Created by chenyong on 2018/3/28.
 *
 * 县
 */

public class Country extends DataSupport {

    private  int id;
    private String country_name;
    private String country_code;

    /**
     *县所属的城市
     */
    private City city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country_name='" + country_name + '\'' +
                ", country_code='" + country_code + '\'' +
                ", city=" + city +
                '}';
    }
}
