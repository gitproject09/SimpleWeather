package com.sopan.weather.dagger;

import com.sopan.weather.dagger.module.ApplicationModule;
import com.sopan.weather.dagger.module.DbModule;
import com.sopan.weather.dagger.module.NetworkModule;
import com.sopan.weather.dagger.module.RepositoryModule;
import com.sopan.weather.dagger.module.ServiceModule;
import com.sopan.weather.view.cityadd.CityAddDialogFragment;
import com.sopan.weather.view.cityforecast.CityForecastFragment;
import com.sopan.weather.view.citylist.CityListFragment;
import com.sopan.weather.view.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        NetworkModule.class,
        ServiceModule.class,
        RepositoryModule.class,
        DbModule.class
})
public interface DiComponent {

    void inject(MainActivity activity);

    void inject(CityListFragment fragment);

    void inject(CityForecastFragment fragment);

    void inject(CityAddDialogFragment fragment);

}
