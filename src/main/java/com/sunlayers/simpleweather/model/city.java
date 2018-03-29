package com.sunlayers.simpleweather.model;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by chenyong on 2018/3/28.
 *
 * 市
 */

public class City extends DataSupport {
    private int id;
    private String city_name;
    private String city_code;

    /**
     * 城市所属的省
     */
    private Province province;

    /**
     * 城市包含的下级县
     */
    private List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }


    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city_name='" + city_name + '\'' +
                ", city_code='" + city_code + '\'' +
                ", Province=" + province +
                '}';
    }
}
