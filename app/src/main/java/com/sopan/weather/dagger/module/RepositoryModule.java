package com.sopan.weather.dagger.module;

import android.content.Context;

import com.sopan.weather.data.repository.CityRepository;
import com.sopan.weather.data.repository.ForecastRepository;
import com.sopan.weather.data.repository.impl.CityRepositoryImpl;
import com.sopan.weather.data.repository.impl.ForecastRepositoryImpl;
import com.sopan.weather.data.service.ForecastService;
import com.sopan.weather.model.City;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    CityRepository provideCityRepository(Context context, @Named("CityDao") RuntimeExceptionDao<City, Integer> cityDao) {
        return new CityRepositoryImpl(context, cityDao);
    }

    @Provides
    ForecastRepository provideForecastRepository(ForecastService service, Context context) {
        return new ForecastRepositoryImpl(service, context);
    }

}
