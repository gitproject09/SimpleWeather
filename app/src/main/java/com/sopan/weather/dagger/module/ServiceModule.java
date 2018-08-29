package com.sopan.weather.dagger.module;

import com.sopan.weather.data.service.ForecastService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ServiceModule {

    @Provides
    ForecastService provideForecastService(Retrofit retrofit) {
        return retrofit.create(ForecastService.class);
    }

}
