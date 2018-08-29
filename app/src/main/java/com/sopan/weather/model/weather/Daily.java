package com.sopan.weather.model.weather;

import com.sopan.weather.model.base.BaseModel;

import java.util.ArrayList;
import java.util.List;

public class Daily extends BaseModel {

    public String summary;
    public String icon;
    public List<Data> data = new ArrayList<>();

}
