package com.sopan.weather.data.dto;

import com.sopan.weather.model.weather.Currently;
import com.sopan.weather.model.weather.Daily;

import java.io.Serializable;

public class ForecastDto implements Serializable {

    public double latitude;
    public double longitude;
    public String timezone;
    public Integer offset;
    public Currently currently;
    public Daily daily;

}
