package com.sopan.weather.data.repository;

import com.sopan.weather.data.dto.ForecastDto;

import rx.Observable;

public interface ForecastRepository {

    Observable<ForecastDto> getForecast(double latitude, double longitude);

}
