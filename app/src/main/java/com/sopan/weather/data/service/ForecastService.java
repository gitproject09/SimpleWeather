package com.sopan.weather.data.service;


import com.sopan.weather.data.dto.ForecastDto;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface ForecastService {

    @GET("forecast/{key}/{latitude},{longitude}")
    Observable<ForecastDto> getForecast(@Path("key") String key,
                                        @Path("latitude") double latitude,
                                        @Path("longitude") double longitude);
}
