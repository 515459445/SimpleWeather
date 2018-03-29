package com.sunlayers.simpleweather.db;

import android.database.sqlite.SQLiteDatabase;

import com.sunlayers.simpleweather.model.City;
import com.sunlayers.simpleweather.model.Country;
import com.sunlayers.simpleweather.model.Province;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

/**
 * Created by chenyong on 2018/3/28.
 *
 * 封装数据库相关操作的类
 */

public class WeatherDB {

    private SQLiteDatabase db;
    private static WeatherDB weatherDB;

    public WeatherDB(){
        db = Connector.getDatabase();//正式生成数据库
    }

    public synchronized static WeatherDB getInstence(){
        if(weatherDB == null){
            weatherDB = new WeatherDB();
        }
        return weatherDB;
    }

    /**
     * 将province保存到数据库
     * @param province
     */
    public void saveProvince(Province province){
        if(province != null){
            province.save();
        }
    }

    /**
     * 将city保存到数据库
     * @param city
     */
    public void saveCity(City city){
        if(city != null){
            city.save();
        }
    }

    /**
     * country
     * @param country
     */
    public void saveCountry(Country country){
        if(country != null){
            country.save();
        }
    }

    /**
     * 从数据库读取全国的省份province数据
     */
    public List<Province> getProvinces(){
        return DataSupport.findAll(Province.class);
    }


    /**
     * 从数据库读取省份下城市city数据
     */
    public List<City> getCities(int provinceId){
        Province province = DataSupport.find(Province.class,provinceId);
        return province.getCities();
    }


    /**
     * 从数据库读取城市所属的县country数据
     */
    public List<Country> getCountrys(int cityId){
        City city = DataSupport.find(City.class,cityId);
        return city.getCountries();
    }

    public void closeDB(){
        if(db != null){
            db.close();
        }
    }


}
