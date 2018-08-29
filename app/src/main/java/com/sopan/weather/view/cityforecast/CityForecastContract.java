package com.sopan.weather.view.cityforecast;

import com.sopan.weather.data.dto.ForecastDto;
import com.sopan.weather.model.City;

public interface CityForecastContract {

    interface View {

        void showLoadingLayout();

        void showContentLayout();

        void showErrorLayout();

        void updateForecast(ForecastDto dto);

    }

    interface Presenter {

        void setView(CityForecastContract.View view);

        void loadData(City city);

        void loadDataWithProgress(City city);

        void refreshUi();

        void onDestroy();

    }

}
